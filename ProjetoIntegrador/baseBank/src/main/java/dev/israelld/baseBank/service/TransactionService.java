package dev.israelld.baseBank.service;

import dev.israelld.baseBank.controller.form.TransferForm;
import dev.israelld.baseBank.model.Account;
import dev.israelld.baseBank.model.AccountCurrent;
import dev.israelld.baseBank.model.AccountSpecial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionService {

    @Autowired
    private ClientService clientService;
    @Autowired
    private AccountCurrentService accountCurrentService;
    @Autowired
    private AccountSpecialService accountSpecialService;
    @Autowired
    private AccountService accountService;

    public String deposit(Long id,Account obj) {
        Account account = accountService.findById(id);
        String typeAccount = account.getTipo();
        if (typeAccount.equals("S")) {
            AccountSpecial newAccountSpecial = accountSpecialService.findById(id);
            newAccountSpecial.setBalance(obj.getBalance() + newAccountSpecial.getBalance());
            accountSpecialService.update(id, newAccountSpecial);
            return String.format("Saldo atual: %.2f\nLimite especial atual: %.2f", newAccountSpecial.getBalance(), newAccountSpecial.getLimitValue());
        } else if (typeAccount.equals("C")) {

            AccountCurrent newAccountCurrent = accountCurrentService.findById(id);
            newAccountCurrent.setBalance(obj.getBalance() + newAccountCurrent.getBalance());
            accountCurrentService.update(id, newAccountCurrent);
            return String.format("Saldo atual: %.2f", newAccountCurrent.getBalance());
        } else {
            return "Ocorreu um erro!\n Tente novamente mais tarde.";
        }
    }

    public String withdraw(Long id, Account obj) {
        Account account = accountService.findById(id);
        if (account.getTipo().equals("S")) {
            AccountSpecial newAccountSpecial = accountSpecialService.findById(id);
            if (newAccountSpecial.getBalance() - obj.getBalance() < 0) {
                if (newAccountSpecial.getBalance() - obj.getBalance() + newAccountSpecial.getLimitValue() >= 0) {
                    newAccountSpecial.setLimitValue((newAccountSpecial.getBalance() + newAccountSpecial.getLimitValue()) - obj.getBalance());
                    newAccountSpecial.setBalance(0);
                    accountSpecialService.update(id, newAccountSpecial);
                    return String.format("Saldo atual: %.2f\nLimite especial atual: %.2f", newAccountSpecial.getBalance(), newAccountSpecial.getLimitValue());
                }
                else {
                    return String.format("Saldo insuficiente!\nSaldo atual: %.2f\nLimite especial atual: %.2f", newAccountSpecial.getBalance(), newAccountSpecial.getLimitValue());
                }
            } else {
                newAccountSpecial.setBalance(newAccountSpecial.getBalance() - obj.getBalance());
                accountSpecialService.update(id, newAccountSpecial);
                return String.format("Saldo atual: %.2f\nLimite especial atual: %.2f", newAccountSpecial.getBalance(), newAccountSpecial.getLimitValue());
            }
        } else if (account.getTipo().equals("C")) {
            AccountCurrent newAccountCurrent = accountCurrentService.findById(id);
            if (newAccountCurrent.getBalance() - obj.getBalance() < 0) {

                return String.format("Saldo insuficiente!\nSaldo atual: %.2f", newAccountCurrent.getBalance());
            }
            else {
                newAccountCurrent.setBalance(newAccountCurrent.getBalance() - obj.getBalance());
                accountCurrentService.update(id, newAccountCurrent);
                return String.format("Saldo atual: %.2f", newAccountCurrent.getBalance());
            }
        } else {
            return "Ocorreu um erro!\n Tente novamente mais tarde.";
        }
    }

    public String transfer(Long id, TransferForm form) {

        Account accountDestination = accountService.findById(form.getAccountDestination());
        Account accountOrigin = accountService.findById(id);

            if (accountOrigin.getBalance() - form.getValueToTransfer() < 0) {
                return String.format("Saldo insuficiente!\nSaldo atual: %.2f", accountOrigin.getBalance());
            }else {
                if (accountDestination.getTipo().equals("C")) {
                    System.err.println("Des C");
                    AccountCurrent newAccountCurrent = accountCurrentService.findById(accountDestination.getId());
                    newAccountCurrent.setBalance(form.getValueToTransfer() + accountDestination.getBalance());
                    accountCurrentService.update(id, newAccountCurrent);
                }
                else if (accountDestination.getTipo().equals("S")) {
                    System.err.println("Des S 1");
                    System.err.format("%d", accountDestination.getId());
                    AccountSpecial newAccountSpecial = accountSpecialService.findById(accountDestination.getId());
                    newAccountSpecial.setBalance(form.getValueToTransfer() + accountDestination.getBalance());
                    accountSpecialService.update(id, newAccountSpecial);
                }
                if (accountOrigin.getTipo().equals("C")) {
                    System.err.println("Erro Or C");
                    AccountCurrent newAccountCurrent = accountCurrentService.findById(accountOrigin.getId());
                    newAccountCurrent.setBalance(accountOrigin.getBalance() - form.getValueToTransfer());
                    accountCurrentService.update(id, newAccountCurrent);
                }
                else if (accountOrigin.getTipo().equals("S")) {
                    System.err.println("Erro Or S");
                    AccountSpecial newAccountSpecial = accountSpecialService.findById(accountOrigin.getId());
                    newAccountSpecial.setBalance(accountOrigin.getBalance() - form.getValueToTransfer());
                    accountSpecialService.update(id, newAccountSpecial);
                }
                return String.format("Transferência realizada com sucesso!\n Saldo atual: %.2f", accountOrigin.getBalance());
            }
    }
}

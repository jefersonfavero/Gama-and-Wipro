package dev.israelld.baseBank.controller.form;

public class TransferForm {

    private Long accountDestination;
    private double valueToTransfer;

    public Long getAccountDestination() {
        return accountDestination;
    }

    public double getValueToTransfer() {
        return valueToTransfer;
    }
}

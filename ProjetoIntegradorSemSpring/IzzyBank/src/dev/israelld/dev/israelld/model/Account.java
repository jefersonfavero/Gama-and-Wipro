package dev.israelld.dev.israelld.model;

abstract class Account {
    private String number;
    private double balance;
    private boolean status;
    private CreditCard creditCard;
    private Client client;
    private Agency agency;

    public Account() {
    }

    public Account(String number, double balance, boolean status, CreditCard creditCard, Client client, Agency agency) {
        this.number = number;
        this.balance = balance;
        this.status = status;
        this.creditCard = creditCard;
        this.client = client;
        this.agency = agency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }


}

package dev.israelld.dev.israelld.model;

public class CreditCard {
    private String cardNumbering;
    private String CVV;
    private Client client;

    public CreditCard() {
    }

    public CreditCard(String cardNumbering, String CVV, Client client) {
        this.cardNumbering = cardNumbering;
        this.CVV = CVV;
        this.client = client;
    }

    public String getCardNumbering() {
        return cardNumbering;
    }

    public void setCardNumbering(String cardNumbering) {
        this.cardNumbering = cardNumbering;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

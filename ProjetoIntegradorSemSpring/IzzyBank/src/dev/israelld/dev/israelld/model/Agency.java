package dev.israelld.dev.israelld.model;

public class Agency {
    private int number;
    private String agencyName;
    private String agencyNumber;
    private String cnpj;

    public Agency() {
    }

    public Agency(int number, String agencyName, String agencyNumber, String cnpj) {
        this.number = number;
        this.agencyName = agencyName;
        this.agencyNumber = agencyNumber;
        this.cnpj = cnpj;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(String agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

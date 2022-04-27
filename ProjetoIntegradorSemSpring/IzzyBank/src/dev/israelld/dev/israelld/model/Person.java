package dev.israelld.dev.israelld.model;

abstract class Person extends Address{

    private int id;
    private String cpf;
    private String name;
    private String contactNumber;
    private Address address;
    
    public Person() {}

    public Person(int id, String cpf, String name, String contactNumber, Address address) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public Person(int id, String city, String street, String houseNumber, String state, String zip, String country, int idPerson, String cpf, String name, String contactNumber, Address address) {
        super(id, city, street, houseNumber, state, zip, country);
        this.id = idPerson;
        this.cpf = cpf;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

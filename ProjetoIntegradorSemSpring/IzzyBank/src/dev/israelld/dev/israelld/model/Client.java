package dev.israelld.dev.israelld.model;

public class Client extends Person{

    public Client() {
    }

    public Client(int id, String cpf, String name, String contactNumber, Address address) {
        super(id, cpf, name, contactNumber, address);
    }

    public Client(int id, String city, String street, String houseNumber, String state, String zip, String country, int idPerson, String cpf, String name, String contactNumber, Address address) {
        super(id, city, street, houseNumber, state, zip, country, idPerson, cpf, name, contactNumber, address);
    }
}

package org.example;

public class Contact {
    private String name;
    private String surname;
    private Long phoneNumber;

    public Contact(String name, String surname, Long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package com.example.bankmanagement.model;


import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String nic;
    private String phone;

    public Customer(Long id) {
        this.id = id;
    }

    public Object getFullName() {
    return 0;}

    public Object getEmail() {
    return 0;}

    public long getNic() {
    return 0;}

    public Object getPhone() {
    return 0;}

    public void getClass(Object fullName) {
    }

    public void clone(Object phone) {
    }


    // Getters and Setters (Right click > Generate > Getter and Setter)
}


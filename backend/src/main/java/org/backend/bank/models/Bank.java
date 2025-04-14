package org.backend.bank.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "banks")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;


    @OneToMany(mappedBy = "bank")
    @JsonBackReference
    private List<BankAccount> bankAccounts;


    @OneToMany(mappedBy = "bank")
    @JsonBackReference
    private List<Transfer> transfers;

}

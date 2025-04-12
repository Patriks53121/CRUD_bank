package org.backend.bank.models;

import java.util.ArrayList;
import java.util.List;

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
    @GeneratedValue
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;

    @PrimaryKeyJoinColumn(name = "bank_account_id")
    @OneToMany
    private List<BankAccount> bankAccounts;

    @PrimaryKeyJoinColumn(name = "transfer_id")
    @OneToMany
    private List<Transfer> transfers;

}

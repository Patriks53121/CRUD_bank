package org.backend.bank.models;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bank_accounts")
public class BankAccount{

    @Id
    @GeneratedValue
    private int id;

    @Column(name="card_number")
    private String cardNumber;
    @Column(name="account_number")
    private final UUID accountNumber = UUID.randomUUID();
    @Column(name="balance")
    private float balance;

    @PrimaryKeyJoinColumn(name = "transfer_id")
    @OneToMany
    private List<Transfer> transfers;

}

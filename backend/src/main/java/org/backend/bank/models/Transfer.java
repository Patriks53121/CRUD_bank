package org.backend.bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="uuid")
    private UUID uuid = UUID.randomUUID();

    @Column(name="amount")
    private float amount;
    @Column(name="description")
    private String description;


    @PrimaryKeyJoinColumn(name = "bank_account_id")
    @ManyToOne
    private BankAccount sender;

}

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
public class Transfer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name="uuid")
    private UUID uuid = UUID.randomUUID();

    @Column(name="amount")
    private float amount;
    @Column(name="description")
    private String description;

    @JoinColumn(name = "bank_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    Bank bank;

    @JoinColumn(name = "bank_account_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private BankAccount sender;

}

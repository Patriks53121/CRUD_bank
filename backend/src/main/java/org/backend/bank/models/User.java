package org.backend.bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="username")
    private String password;
    @Column(name="email")
    private String email;

    @OneToOne(mappedBy = "user")
    private BankAccount bankAccount;

}

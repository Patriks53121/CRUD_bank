package org.backend.bank.services;

import org.backend.bank.models.Bank;
import org.backend.bank.models.BankAccount;
import org.backend.bank.models.Transfer;
import org.backend.bank.models.User;
import org.springframework.stereotype.Repository;

public interface ObjectInterface {

    BankAccount update(BankAccount bankAccount);
    User update(User user);
    Bank update(Bank bank);
    Transfer update(Transfer transfer);

    BankAccount save(BankAccount bankAccount);
    User save(User user);
    Bank save(Bank bank);
    Transfer save(Transfer transfer);

    Object findAll(Object object);

}

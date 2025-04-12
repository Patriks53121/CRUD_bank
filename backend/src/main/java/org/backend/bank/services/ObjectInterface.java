package org.backend.bank.services;

import org.backend.bank.models.Bank;
import org.backend.bank.models.BankAccount;
import org.backend.bank.models.Transfer;
import org.backend.bank.models.User;
import org.springframework.stereotype.Repository;

public interface ObjectInterface<T> {

    Object update(BankAccount bankAccount);
    Object update(User user);
    Object update(Bank bank);
    Object update(Transfer transfer);
}

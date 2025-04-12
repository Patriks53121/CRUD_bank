package org.backend.bank.repositories;

import org.backend.bank.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccRepository extends JpaRepository<BankAccount, Integer> {
}

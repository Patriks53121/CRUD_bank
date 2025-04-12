package org.backend.bank.services;

import org.backend.bank.models.Bank;
import org.backend.bank.models.BankAccount;
import org.backend.bank.models.Transfer;
import org.backend.bank.models.User;
import org.backend.bank.repositories.BankAccRepository;
import org.backend.bank.repositories.BankRepository;
import org.backend.bank.repositories.TransferRepository;
import org.backend.bank.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class objectService implements ObjectInterface {

    @Autowired
    private BankAccRepository bankAccountRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private BankRepository bankRepo;
    @Autowired
    private TransferRepository transferRepo;

    @Override
    public BankAccount update(BankAccount bankAccount) {
        BankAccount existingAccount = bankAccountRepo.findById(bankAccount.getId()).orElseThrow(() -> new RuntimeException("BankAccount with id " + bankAccount.getId() + " not found."));
        existingAccount.setCardNumber(bankAccount.getCardNumber());
        existingAccount.setBalance(bankAccount.getBalance());
        existingAccount.setTransfers(bankAccount.getTransfers());
        return bankAccountRepo.save(existingAccount);
    }

    @Override
    public User update(User user) {
        User existingUser = userRepo.findById(user.getId()).orElseThrow(() -> new RuntimeException("User with id:" + user.getId() + " not found"));
        existingUser.setName(user.getName());
        existingUser.setSurname(user.getSurname());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.getBankAccount().setTransfers(user.getBankAccount().getTransfers());
        return userRepo.save(existingUser);
    }

    @Override
    public Object update(Bank bank) {
        Bank existingBank = bankRepo.findById(bank.getId()).orElseThrow(() -> new RuntimeException("Bank with id:" +  bank.getId() + " not found"));
        existingBank.setBankAccounts(bank.getBankAccounts());
        existingBank.setTransfers(bank.getTransfers());
        return bankRepo.save(existingBank);
    }

    @Override
    public Object update(Transfer transfer) {
        Transfer existingTransfer = transferRepo.findById(transfer.getId()).orElseThrow(() -> new RuntimeException("Transfer with id:" + transfer.getId() + " not found"));
        existingTransfer.setUuid(transfer.getUuid());
        existingTransfer.setAmount(transfer.getAmount());
        existingTransfer.setSender(transfer.getSender());
        existingTransfer.setDescription(transfer.getDescription());
        return transferRepo.save(existingTransfer);
    }

}
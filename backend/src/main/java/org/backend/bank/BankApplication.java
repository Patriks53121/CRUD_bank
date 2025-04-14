package org.backend.bank;

import org.backend.bank.models.Bank;
import org.backend.bank.models.BankAccount;
import org.backend.bank.models.Transfer;
import org.backend.bank.models.User;
import org.backend.bank.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
public class BankApplication {

    @Autowired
    private BankRepository bankRepo;

    @Autowired
    private BankAccRepository bankAccRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private TransferRepository transferRepo;

//    static Bank bank = new Bank();
//    static BankAccount bankAcc = new BankAccount();
//    static User user = new User();
//    static Transfer transfer = new Transfer();

    public static void main(String[] args) {
//        bank.setName("bank_name");
//        bank.setAddress("bank_address");
//        bank.setPhone("phone");
//
//        bankAcc.setCardNumber("card_number");
//        bankAcc.setBalance(123);
//        bankAcc.setBank(bank);
//
//        user.setName("name");
//        user.setSurname("surname");
//        user.setEmail("email");
//        user.setPassword("password");
//        user.setBankAccount(bankAcc);
//
//        transfer.setSender(user.getBankAccount());
//        transfer.setBank(bank);
//        transfer.setAmount(123);
//        transfer.setDescription("description");


        SpringApplication.run(BankApplication.class, args);
    }

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    }
}

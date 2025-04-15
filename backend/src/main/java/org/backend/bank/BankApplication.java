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


    public static void main(String[] args) {



        SpringApplication.run(BankApplication.class, args);
    }

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    }
}

package org.backend.bank.controllers;

import org.backend.bank.models.Bank;
import org.backend.bank.models.BankAccount;
import org.backend.bank.models.Transfer;
import org.backend.bank.models.User;
import org.backend.bank.repositories.BankAccRepository;
import org.backend.bank.repositories.BankRepository;
import org.backend.bank.repositories.TransferRepository;
import org.backend.bank.repositories.UserRepository;
import org.backend.bank.services.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class ListController {


    @Autowired
    private BankRepository bankRepo;

    @Autowired
    private BankAccRepository bankAccRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private TransferRepository transferRepo;

    @Autowired
    private ObjectService objectService;

    @GetMapping("/api/bank/list")
    public ResponseEntity<Object> list() {
        return ResponseEntity.ok(objectService.findAll(new Bank()));
    }

}

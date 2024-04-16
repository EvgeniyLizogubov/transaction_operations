package com.github.evgenylizogubov.solva.web;

import com.github.evgenylizogubov.solva.model.Transaction;
import com.github.evgenylizogubov.solva.repository.TransactionRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/transaction", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class TransactionController {
    private final TransactionRepository repository;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Transaction> create(@Valid @RequestBody Transaction transaction) {
        log.info("TransactionController: create {}", transaction);
        Transaction created = repository.save(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}

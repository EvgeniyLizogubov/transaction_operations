package com.github.evgenylizogubov.solva.repository;

import com.github.evgenylizogubov.solva.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}

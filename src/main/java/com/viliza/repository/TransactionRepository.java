package com.viliza.repository;

import com.viliza.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByCustomerIdAndTransactionDateAfter(Long customerId, LocalDate transactionDate);



}






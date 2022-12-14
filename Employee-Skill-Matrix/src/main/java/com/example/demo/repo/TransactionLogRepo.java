package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Transaction_Log;

public interface TransactionLogRepo extends JpaRepository<Transaction_Log, Integer> {

}

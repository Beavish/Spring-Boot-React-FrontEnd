package com.kieran.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kieran.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}

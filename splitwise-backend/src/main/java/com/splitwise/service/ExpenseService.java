
package com.splitwise.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.splitwise.entity.Expense;
import com.splitwise.repository.ExpenseRepository;

@Service
public class ExpenseService {
 @Autowired
 private ExpenseRepository repo;

 public Expense addExpense(Expense e){
  return repo.save(e);
 }
 public List<Expense> getAll(){
  return repo.findAll();
 }
}

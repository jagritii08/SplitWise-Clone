
package com.splitwise.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.splitwise.entity.Expense;
import com.splitwise.service.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin("*")
public class ExpenseController {
 @Autowired
 private ExpenseService service;

 @PostMapping
 public Expense add(@RequestBody Expense e){
  return service.addExpense(e);
 }

 @GetMapping
 public List<Expense> get(){
  return service.getAll();
 }
}

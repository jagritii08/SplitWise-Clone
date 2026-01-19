
package com.splitwise.entity;
import jakarta.persistence.*;

@Entity
public class Expense {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String description;
 private double amount;

 @ManyToOne
 private User paidBy;

 public Long getId(){return id;}
 public void setId(Long id){this.id=id;}
 public String getDescription(){return description;}
 public void setDescription(String description){this.description=description;}
 public double getAmount(){return amount;}
 public void setAmount(double amount){this.amount=amount;}
 public User getPaidBy(){return paidBy;}
 public void setPaidBy(User paidBy){this.paidBy=paidBy;}
}

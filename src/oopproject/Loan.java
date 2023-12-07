/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

import java.util.Date;

/**
 *
 * @author khalidzaro
 */
public class Loan {
    
    private String borrowerName;
    private Date loanDate;
    private Date dueDate;
    private int NO;

    public Loan(String borrowerName, Date loanDate, Date dueDate, int NO) {
        this.borrowerName = borrowerName;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.NO = NO;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public int getNO() {
        return NO;
    }
    
    public boolean isBookOnLoan(Book book) {
    
        return false;  
    }
}

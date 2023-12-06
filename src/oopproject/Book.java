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
public class Book  implements Display{
    
    private int NO;
    private String title;
    private Auther auther;
    private String Genre;
    private String version;
    private Date date;
    private Iterable<Loan> loans;

    Book(String NO, String title, String auther, String Genre, String version, String date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Auther getAuther() {
        return auther;
    }

    public void setAuther(Auther auther) {
        this.auther = auther;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book() {
    }

    public Book(int NO, String title, Auther auther, String Genre, String version, Date date) {
        this.NO = NO;
        this.title = title;
        this.auther = auther;
        this.Genre = Genre;
        this.version = version;
        this.date = date;
    }
    
    

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean inLoan() {
        // Assuming you have a Loan class with a method isBookOnLoan
        for (Loan loan : loans) {
            if (loan.isBookOnLoan(this)) {
                return true;
            }
        }
        return false;
    }
    
    
    
}

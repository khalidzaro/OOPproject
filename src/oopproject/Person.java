package oopproject;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khalidzaro
 */

public class Person implements Display {

    static void add(Auther auther) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    private int id;
    private String name;
    private String address;
    private DateOfBirth BOD;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DateOfBirth getBOD() {
        return BOD;
    }

    public void setBOD(DateOfBirth BOD) {
        this.BOD = BOD;
    }

    public Person() {
    }

    public Person(int id, String name, String address, DateOfBirth BOD) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.BOD = BOD;
    }

    
    
    
    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean inLoan() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}

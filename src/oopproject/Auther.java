/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

/**
 *
 * @author khalidzaro
 */
public class Auther extends Person {

    public Auther() {
    }

    public Auther(int id, String name, String address, DateOfBirth BOD) {
        super(id, name, address, BOD);
    }

    @Override
    public String getInfo() {
        return super.getInfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

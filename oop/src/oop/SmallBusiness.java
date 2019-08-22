/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ernest Menasu
 */
public class SmallBusiness extends enterprise implements contractors {
    
    void revenue(){
    System.out.println("No revenue");
    }
@Override
public void deliver(){

  System.out.println("Delivering on " +LocalDate.now());  
}
    
@Override
    public void pack(){
    System.out.println(new Date());
    }    

    @Override
    public void payTax() {
        try { 
           
            throw new oopException("This is a custom exception");
        } catch (oopException ex) {
            
        } System.out.println("Not emplemented");
    }

    @Override
    public void drive() {
        contractors.super.drive(); //To change body of generated methods, choose Tools | Templates.
    }
}

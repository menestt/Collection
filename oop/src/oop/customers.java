/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.time.LocalDate;

/**
 *
 * @author Ernest Menasu
 */
public class customers extends enterprise { 

    @Override
    public void payTax() {
        try {
            throw new oopException("custom exception");
        } catch (oopException ex) {
            
        }System.out.println(LocalDate.now().toString());
    }
    
}

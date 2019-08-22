/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.time.LocalDateTime;

/**
 *
 * @author Ernest Menasu
 */
public class LargeBusiness extends customers {
    
    @Override
    public void payTax() {
    System.out.println("Large Businesses will pay their tax on " +LocalDateTime.now().toString());
    }
}

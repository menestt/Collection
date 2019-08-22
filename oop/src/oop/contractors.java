/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ernest Menasu
 */
public interface contractors {
    
    
    final String st= "Interface illustration";
    
    public void deliver();
    
    public void pack();
    
    default void drive(){
    System.out.println("A method declared default can be implemented here");
    }
}

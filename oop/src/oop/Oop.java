/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**Driver class
 *
 * @author Ernest Menasu
 */
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SmallBusiness sm= new SmallBusiness();
           LargeBusiness lb = new LargeBusiness();
              enterprise ct    = new customers();
               contractors co= new SmallBusiness();
                enterprise et    = new LargeBusiness();
        
        sm.drive();
        co.deliver();
        co.drive();
        co.getClass();
        co.pack();
        co.hashCode();
        
        lb.payTax();
        lb.getClass();
        
        ct.sale();
        ct.payTax();
        
        et.payTax();
    }
    
}

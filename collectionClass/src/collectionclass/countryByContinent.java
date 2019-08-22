/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionclass;

import java.util.Comparator;

/**
 *
 * @author Ernest Menasu
 */
public class countryByContinent implements Comparator <country> {
    
    
    @Override
    public int compare(country c1, country c2){
    
        return c1.getContinent().compareTo(c2.getContinent());
    }
}

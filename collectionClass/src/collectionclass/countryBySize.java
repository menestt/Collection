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
public class countryBySize implements Comparator <country> {
    
    @Override
    public int compare( country c1, country c2){
    
      if(c1.getSize()<c2.getSize()) return -1;
      if(c1.getSize()>c2.getSize()) return 1;
      else    
    return 0;
    }
    
}

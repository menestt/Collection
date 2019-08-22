/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionclass;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ernest Menasu
 * *08/22/19
 */
public class CollectionClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<country> list= new LinkedList<>();
        countryByName name= new countryByName();
        countryBySize size= new countryBySize();
        countryByContinent continent= new countryByContinent();
        
        list.add( new country(2100000, "France ", " Europe"));
        list.add( new country(1100000, "Cameroun ", " Africa"));
        list.add( new country(9300000, "England ", " Europe"));
        list.add( new country(6100000, "United States ", "America"));
        list.add( new country(2104500, "Argentina ", " America"));
        list.add( new country(4100000, "Canada ", " America"));
        list.add( new country(8100000, "Nigeria ", " Africa"));
        list.add( new country(9100000, "Italy ", " Europe"));
        list.add( new country(5100000, "Gabon ", " Africa"));
        
        Collections.sort(list, name);
        System.out.println("Sorting our list of country by name\n");
        for( country st:list){
        System.out.println( "Country name:>>"
                +st.getName()+ " Continent:>> " 
                +st.getContinent()+ " Population:>> "
                +st.getSize()
        );
        }
        
        Collections.sort(list, continent);
         System.out.println();
        System.out.println("Sorting our list of country by continent\n");
        for( country st:list){
        System.out.println( "Country name:>>"
                +st.getName()+ " Continent:>> " 
                +st.getContinent()+ " Population:>> "
                +st.getSize()
        );
        }
         System.out.println();
        Collections.sort(list, size);
        System.out.println("Sorting our list of country by size(Population)\n");
        for( country st:list){
        System.out.println( "Country name:>>"
                +st.getName()+ " Continent:>> " 
                +st.getContinent()+ " Population:>> "
                +st.getSize()
        );
        }
        
        
    }
    
}

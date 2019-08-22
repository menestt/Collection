/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionclass;

/**
 *
 * @author Ernest Menasu
 */
public class country {
    
    int size;
    String name,continent;

    public country(int size, String name, String continent) {
        this.size = size;
        this.name = name;
        this.continent = continent;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
  
    
    
}

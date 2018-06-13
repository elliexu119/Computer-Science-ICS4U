/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

import unit5.HashTable;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author 1xuell
 */
public class HashTableTestData {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        
        
        //size() == i+1;
        //capacity == 53
        //contains (s.getPK())
        //get (s.getPK()).equals(...) 
        //contains (s);
        //containsKey(s.getSK()); 
        //loadFactor() == (i/53);
                
        String colours[] = {
        "\u001B[31m", //red
        "\u001B[32m", //green
        "\u001B[33m", //yellow
        "\u001B[34m", //blue
        "\u001B[35m", //purple
        "\u001B[36m", //cyan
    };
        
        String RESET = "\u001B[0m";
        HashTable h = new HashTable(48); 
        assert (h.capacity() == 53); 
        int phone;
        String first, last; 
        Student s = new Student ((int) (Math.random() * 100) + "", (int) (Math.random() * 100) + "", (int) (Math.random() * 100));
        Student random = null;
        
        //ADD ONE STUDENT
        h.put(s.getkey(), s);
        assert(h.isEmpty() == false);
        assert(h.size() == 1);
        
        //EMPTY CASE
        h.makeEmpty();
        assert(h.isEmpty() == true);
        assert(h.size() == 0);
        assert(h.capacity() == 53);
        assert(h.contains(s) == false);
        assert(h.get(s.getkey()) == null);
        assert(h.containsKey(s.getkey()) == false); 
        assert(h.loadFactor() == 0); 
        
        //enter data and REHASH
        System.out.println(colours[4] + "  INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT INPUT" + RESET);
        for (int i = 0; i < 126; i ++){
            phone = (int) (Math.random() * 100);
            first = (int) (Math.random() * 100) + "";
            last = (int) (Math.random() * 100) + "";
            
            s = new Student(first, last, phone);
            if (i == 5){
                random = s;
            }
            
            h.put(s.getkey(), s);
            System.out.println(colours[(int) (Math.random() * 6)]);
            System.out.format("%2s %12s%2s %11s%2s %7s%2s %20s %4s %9s %4s %11s %s",
                    i, " first name:", first, " last name:", last, " phone:", phone, "SIZE", h.size(), "CAPACITY", h.capacity(), "LOAD FACTOR", h.loadFactor()); 
            System.out.println(RESET);
        }
        
        assert(h.size() == 126);
        System.out.println(h.capacity());
        assert(h.capacity() == 499); 
        
        //SOPL
        System.out.println(colours[4] + "\n \nDA HASH TABLE" + RESET);
        //System.out.println(h.toString());
        System.out.println("");
        
        //CONTAINS

        assert(h.contains(random) == true);
        assert(h.containsKey(random.getkey()) == true);
        s = new Student ("101", "101", 101);
        assert(h.contains(s) == false);
        assert(h.containsKey(s.getkey()) == false);
        
        //GET
        System.out.println("FIND STUDENT BASED ON KEY");
        System.out.println("key: " + random.getkey());
        System.out.println("first name: " + h.get(random.getkey()).getFirst() + " last name: " + h.get(random.getkey()).getLast());
        assert(h.get(random.getkey()).getFirst() .equals(random.getFirst()));
        assert(h.get(random.getkey()).getLast() .equals(random.getLast()));
        assert(h.get(random.getkey()).getPhone() == (random.getPhone()));
        
        
    }
    
}

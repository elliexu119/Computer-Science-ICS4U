/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4;

/**
 *
 * @author 1xuell
 */
public class HashTableTestData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //empty case
        //size() == 0
        //capacity == 53
        //contains (123)
        //get (123) 
        //contains (new Student (..));
        //containsKey(123); 
        //loadFactor(); 
        
        //for 39 times, because it resizes 
        //student s = new student(???);
        
        //size() == i+1;
        //capacity == 53
        //contains (s.getPK())
        //get (s.getPK()).equals(...) 
        //contains (s);
        //containsKey(s.getSK()); 
        //loadFactor() == (i/53);
        
        //DONT HAVE TO REMOVE 
        
        
        
        HashTable h = new HashTable(); 
        int value; 
        for (int i = 0; i < 42; i ++){
            value = (int) (Math.random() * 100);
            Student s = new Student("1", "2", value);
            h.put(s.getkey(), s);
            System.out.println(i+1 + ": " + value + " | SIZE " + h.size() + " CAPACITY " + h.capacity() + " LOAD FACTOR " + h.loadFactor());
        }
        
        System.out.println("\nsize " + h.size());
        System.out.println("capacity " + h.capacity());
        System.out.println("");
        System.out.println(h.toString());
        //System.out.println(h.hash(s.getkey())); 
    }
    
}

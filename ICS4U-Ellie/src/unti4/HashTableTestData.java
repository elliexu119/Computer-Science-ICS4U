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
        
        Student s = new Student("1", "2", 1234567890);
        System.out.println(s.getkey());
        Student a = new Student("3", "4", 1234567890);
        System.out.println(a.getkey());
        HashTable h = new HashTable(); 
        h.put(s.getkey(), s);
        h.put(a.getkey(), a);
        System.out.println(h.size());
        System.out.println("");
        System.out.println(h.toString());
        System.out.println(h.hash(s.getkey()));
    }
    
}

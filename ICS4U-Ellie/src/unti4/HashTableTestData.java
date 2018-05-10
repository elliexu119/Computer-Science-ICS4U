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
    }
    
}

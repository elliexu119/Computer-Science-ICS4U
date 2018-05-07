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
        Student s = new Student("jim", "kirk", 1234567890);
        System.out.println(s.getKey());
        Student a = new Student("aaa", "kirk", 1234567890);
        System.out.println(a.getKey());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.examples;

import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookInfo a = new BookInfo(); 
        a.setAuthor(null);
        if (a.getAuthor() == null){
        sopl(a.getAuthor());
        }
    }

    @Override
    public String toString() {
        return "Book{" + '}';
    }
    
}

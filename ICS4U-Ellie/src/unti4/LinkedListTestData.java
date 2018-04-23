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
public class LinkedListTestData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addAtFront("2");
        list.addAtFront("1");
        list.addAtFront("0");

        
        System.out.println("head " + list.head());
        System.out.println("tail " + list.tail());
        list.addAtEnd("0");
        System.out.println("tail " + list.tail());
        System.out.println("list " + list.head());
        list.makeEmpty();
        System.out.println(list.isEmpty());
    }
    
}

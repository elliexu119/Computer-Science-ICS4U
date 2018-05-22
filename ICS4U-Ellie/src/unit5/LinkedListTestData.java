/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

import unit5.LinkList;

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

        System.out.println("IN THE BEGINING");
        System.out.println("THERE WAS NO HEAD");
        assert (list.head() == null);
        System.out.println("NO TAIL");
        assert (list.tail() == null);
        System.out.println("NOTHING BUT THE GREAT EMPTY");
        assert(list.isEmpty() == true);
        assert(list.removeHead() == "-1");
        assert(list.removeTail() == "-1"); 
        assert(list.size() == 0);
        assert(list.remove("10" )== false);
        
        System.out.println("\nTHEN THERE WAS 1");
        list.addAtFront("1");
        System.out.println("AND 2");
        list.addAtFront("2");
        System.out.println("AND MANY MORE FOLLOWED");
        list.addAtFront("2");
        list.addAtFront("3");
        list.addAtFront("4");
        list.addAtFront("5");
        list.addAtFront("6");
        list.addAtEnd("0");
        assert(list.head() == "6");
        assert(list.tail() == "0");

        System.out.println("THE POPULATION QUICKLY GREW");
        System.out.println(list.toString());

        System.out.println("\nBUT LIKE ANY GREAT CIVILIZATION, A WAR ROSE, AND MANY DIED...");
        System.out.println(list.removeHead());
        System.out.println(list.removeTail());
        assert(list.head() == "5");
        assert(list.tail() == "1");
        System.out.println("2");
        assert(list.remove("2") == true);
        System.out.println("FORUNATELY, IT REBUILT ITSELF ON ITS MISTAKES, AND EVERYTHING WAS BETTER");
        assert (list.remove("10") == false);
        System.out.println(list.toString());
        
        System.out.println("\nsize: " + list.size());
        System.out.println("HOWEVER IN THE END, DESPITE THE RISES AND FALLS OF THIS GREAT CIVILIZATION, "
                + "\nNATURE EVENTUALLY FOUND ITS WAY WITH IT, AND...");
        System.out.println("make empty: " + list.makeEmpty());
        System.out.println("size: " + list.size());
        assert(list.size() == 0);
    }

}

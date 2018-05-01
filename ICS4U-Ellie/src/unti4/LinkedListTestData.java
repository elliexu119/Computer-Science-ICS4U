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

        System.out.println("IN THE BEGINING");
        System.out.println("THERE WAS NO HEAD");
        assert (list.head() == null);
        System.out.println("NO TAIL");
        assert (list.tail() == null);
        System.out.println("NOTHING BUT THE GREAT EMPTY");
        assert(list.isEmpty() == true);
        
        System.out.println("\nTHEN THERE WAS 1");
        list.addAtFront("1");
        System.out.println("AND 2");
        list.addAtFront("2");
        System.out.println("AND MANY MORE FOLLOWED");
        list.addAtFront("3");
        list.addAtFront("4");
        list.addAtFront("5");
        list.addAtFront("6");
        list.addAtEnd("0");
        assert(list.head() == "6");
        assert(list.tail() == "0");

        System.out.println("THE POPULATION QUICKLY ROSE");
        System.out.println(list.toString());

        System.out.println("\nBUT LIKE ANY GREAT CIVILIZATION, A WAR ROSE, AND MANY DIED...");
        System.out.println(list.removeHead());
        System.out.println(list.removeTail());
        assert(list.head() == "5");
        assert(list.tail() == "1");
        System.out.println("2");
        list.remove("2");
        System.out.println(list.toString());
        System.out.println("FORUNATELY, A FEW ESCAPED");
        list.remove("10");
   
//        System.out.println(list.toString());
//        System.out.println(list.toString());
//        list.addAtFront("3");
//        list.addAtFront("4");
//        System.out.println(list.toString());
//        System.out.println("remove 3");
//        
//        System.out.println(list.toString());

        //System.out.println("isEmpty: " + list.isEmpty());
        //System.out.println("tail " + list.tail());
        //System.out.println("list " + list.head());
        //System.out.println(list.head.getNext().getValue());
        // System.out.println("size " + list.size());
        //list.makeEmpty();
        //System.out.println(list.isEmpty());
    }

}

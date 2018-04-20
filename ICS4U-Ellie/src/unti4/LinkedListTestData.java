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
        Node node = new Node ("1", null, null); 
        Node next = new Node ("2", null, node);
        node.setNext(next);
        Node prev = new Node ("0", node, null); 
        prev.setNext(node);
        
        System.out.println(next.getNext().getValue());
        
    }
    
}

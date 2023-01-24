/*
 * Ellie
 * May 2018
 * Creates Node objects for the linkedlist. Each node contain formation such as the pointer and the data 
 */
package unit5;

/**
 *
 * @author Wm.Muir
 */
public class Node implements NodeInterface{
    private String data; 
    private Node next = null;

    public Node(String data) {
        //constructor 
        this.data = data;
    }

    @Override
    public Node getNext() {
        //returns the node after this one 
        try{
        return next; 
        }
        catch (NullPointerException ex){
            return null; 
        }
    }

    @Override
    public void setNext(Node newNode) {
        //sets the node after this one 
        next = newNode; 
    }

    @Override
    public String getValue() {
        //returns the data stored in the node 
        return this.data; 
    }

    @Override
    public String toString() {
        return "Node{" + "data= " + data + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4;

/**
 *
 * @author ellix
 */
public class StackQueueTestData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
queue();

        
    }
    public static void stack(){
        Stack stack = new Stack(3); 
        
        stack.makeEmpty();
        System.out.println("FILLING THE STACK UP TO THE BRIM");
        System.out.println("push: " + stack.push(1)); 
        System.out.println("push: " + stack.push(2));
        System.out.println("push: " + stack.push(3));
        System.out.println("push: " + stack.push(4));
        System.out.println("top: " + stack.top());
        
        System.out.println("\nPOPPIN THE STACK");
        System.out.println("pop: " + stack.pop());
        System.out.println("push: " + stack.push(5));
        System.out.println("top: " + stack.top());
        
        System.out.println("\nPOPPIN THE STACK FOUR TIMES");
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("top: " + stack.top());
        
        System.out.println("\nCAPACITY, SIZE, FULL OR EMPTY");
        System.out.println("capacity: " + stack.capacity());
        System.out.println("size: " + stack.size());
        System.out.println("\npush: " + stack.push(1)); 
        System.out.println("size: " + stack.size());
        System.out.println("full?: " + stack.isFull());
        System.out.println("empty?: " + stack.isEmpty());
        System.out.println("make empty: ");
        stack.makeEmpty();
        System.out.println("full?: " + stack.isFull());
        System.out.println("empty?: " + stack.isEmpty());
        
        System.out.println("toString: " + stack.toString());
    }
    
    public static void queue(){
        Queue que = new Queue(4);

        System.out.println("ENQUE");
        System.out.println("enque: " + que.enqueue(2));
        System.out.println("enque: " + que.enqueue(5));
        System.out.println("enque: " + que.enqueue(6));
        System.out.println("enque: " + que.enqueue(10)); 
        System.out.println("enque: " + que.enqueue(9));
        
        System.out.println("\nDEQUE");
        System.out.println("deque: " + que.dequeue());
        System.out.println("deque: " + que.dequeue());
        System.out.println("deque: " + que.dequeue());
        System.out.println("deque: " + que.dequeue());
        System.out.println("deque: " + que.dequeue());
        
        System.out.println("\nSIZE AND CAPACITY");
        System.out.println("capacity: " + que.capacity());
        System.out.println("size: " + que.size());
        System.out.println("enque: " + que.enqueue(9));
        System.out.println("size: " + que.size());
        
        System.out.println("\nEMPTY AND FULL");
        System.out.println("enque: " + que.enqueue(9));
        System.out.println("enque: " + que.enqueue(9));
        System.out.println("enque: " + que.enqueue(9));
        System.out.println("full: " + que.isFull());
        System.out.println("make empty");
        que.makeEmpty();
        System.out.println("size: " + que.size());
        System.out.println("full: " + que.isFull());
      
    }

}

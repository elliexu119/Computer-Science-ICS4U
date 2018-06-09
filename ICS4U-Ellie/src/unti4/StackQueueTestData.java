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
        
        //stack();
        queue();

    }

    public static void linkedList() {

    }

    public static void stack() {
        System.out.println("\n\n--------------------------------------------------------------------");
        System.out.println("QUEUE\n");
        Stack stack = new Stack(3);

        System.out.println("EMPTY CASE");
        stack.makeEmpty();
        assert (stack.pop() == -1);
        assert (stack.top() == -1);
        assert (stack.size() == 0);
        assert (stack.capacity() == 3);
        assert (stack.isEmpty() == true);
        assert (stack.isFull() == false);
        System.out.println("");

        System.out.println("FILLING THE STACK UP TO THE BRIM");
        System.out.println("push: " + stack.push(1));
        System.out.println("push: " + stack.push(2));
        System.out.println("push: " + stack.push(3));
        boolean boo = stack.push(4);
        System.out.println("push: " + boo);
        assert (!boo);
        System.out.println("top: " + stack.top());
        System.out.println("\ntoString: \n" + stack.toString());

        System.out.println("\nPOPPIN THE STACK");
        System.out.println("pop: " + stack.pop());
        System.out.println("push: " + stack.push(5));
        System.out.println("top: " + stack.top());
        assert (stack.top() == stack.stack[stack.pointer]);

        System.out.println("\nPOPPIN THE STACK FOUR TIMES");
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        int bo = stack.pop();
        System.out.println("pop: " + bo);
        assert (bo == -1);
        System.out.println("top: " + stack.top());

        System.out.println("\nCAPACITY, SIZE, FULL OR EMPTY");
        System.out.println("capacity: " + stack.capacity());
        System.out.println("size: " + stack.size());
        System.out.println("\npush: " + stack.push(1));
        System.out.println("size: " + stack.size());
        System.out.println("full?: " + stack.isFull());
        System.out.println("empty?: " + stack.isEmpty());

        System.out.println("\ntoString: \n" + stack.toString());
        System.out.println("make empty");
        stack.makeEmpty();
        System.out.println("\ntoString: \n" + stack.toString());

        System.out.println("full?: " + stack.isFull());
        System.out.println("empty?: " + stack.isEmpty());
        
        String CYANb = "\u001B[46m";
        String YELLOW = "\u001B[33m";
        String RESET = "\u001B[0m";
        System.out.println(CYANb + YELLOW + "\nSTACK WORKS" + RESET);

    }

    public static void queue() {
        System.out.println("\n\n--------------------------------------------------------------------");
        System.out.println("QUEUE\n");
        Queue que = new Queue(4);

        System.out.println("EMPTY CASE");
        assert(que.isEmpty() == true);
        assert(que.isFull() == false);
        assert(que.size() == 0);
        assert(que.capacity() == 4);
        assert(que.dequeue() == -1); 
        assert(que.front == 0);
        assert(que.back == -1);
        System.out.println("");

//        front back
//        enqueue dequeue
//        size capacity
//        isEmpty isFull
//        makeEmpty
        System.out.println("ENQUE");      
        System.out.println("enque: " + que.enqueue(2));
        System.out.println("enque: " + que.enqueue(5));
        System.out.println("enque: " + que.enqueue(6));
        System.out.println("enque: " + que.enqueue(10));
        System.out.println("enque: " + que.enqueue(9));
        System.out.println("\ntoString: \n" + que.toString());

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
        System.out.println("\ntoString: \n" + que.toString());
        
        System.out.println("\nIF FRONT POINTER IS AT THE MIDDLE OF THE ARRAY, "
                + "\nTHEN FILLING IT UP AGAIN");
        que.enqueue(8);
        que.enqueue(9);
        que.enqueue(9);
        que.enqueue(10);
        System.out.println("\ntoString: \n" + que.toString());
        que.dequeue();
        que.dequeue();
        que.dequeue();
        System.out.println("\ntoString: \n" + que.toString());
        que.enqueue(0);
        que.enqueue(1);
        assert (que.enqueue(2) == true);
        assert (que.enqueue(3) == false);
        System.out.println("\ntoString: \n" + que.toString());
        
        String CYANb = "\u001B[46m";
        String YELLOW = "\u001B[33m";
        String RESET = "\u001B[0m";
        System.out.println(CYANb + YELLOW + "\nQUEUE WORKS" + RESET);

    }

}

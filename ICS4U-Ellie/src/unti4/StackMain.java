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
public class StackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue que = new Queue(4);

        que.enqueue(2);
        que.enqueue(5);
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        que.enqueue(6); 
        que.enqueue(9); 
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        que.enqueue(7);
        System.out.println(que.dequeue());

        
    }

}

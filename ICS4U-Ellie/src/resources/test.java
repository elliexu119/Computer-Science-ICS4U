/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import unti4.Queue;

/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q = new Queue();
        
        System.out.println(q.size());
        
        q.enqueue(3);
        q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);
        
        q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();q.dequeue();
        
        
        
        
    }

    
}

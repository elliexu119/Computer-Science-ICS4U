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
public class Queue implements QueueInterface {

    int que[];
    int pointer = -1; 
    int front = 0; 

    @Override
    public Integer front() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Queue(int size) {
        que = new int[size];
        pointer = -1;
        front = 0; 
    }

    @Override
    public Integer back() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enqueue(Integer value) {
        if (que.length -1 == pointer){
            pointer = 0; 
        }
        que[this.pointer+1] = value;
        pointer ++; 
        
    }

    @Override
    public Integer dequeue() {
        int ans = que[this.front];
        que[this.front] = 0; 
        front ++; 
        
        if (front  == que.length-1){
            front = 0;
        }
        return ans; 
    }

    @Override
    public int size() {
        return pointer + 1; 
    }

    @Override
    public int capacity() {
        return que.length;
    }

    @Override
    public boolean isEmpty() {
        return this == null;
    }

    @Override
    public boolean isFull() {
        if (que[que.length-1] != 0){
            return true;
        }
        return false; 
    }

    @Override
    public void makeEmpty() {
        que = null;
    }

}

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

    Integer que[];
    int back = -1;
    int front = 0;

    @Override
    public Integer front() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Queue(int size) {
        que = new Integer[size];
        back = -1;
        front = 0;
    }

    @Override
    public Integer back() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enqueue(Integer value) {
        if (que.length - 1 == back) {
            System.out.println("queue is full");
            return false; 
        } else {
            que[back + 1] = value;
            back++;
            return true; 
        }

    }

    @Override
    public Integer dequeue() {
        int ans = que[front];
        que[front] = null;
        front++;

        if (front == que.length) {
            front = 0;
        }
        //if (ans == )
        return ans;
    }

    @Override
    public int size() {
        return back + 1;
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
        if (que[que.length - 1] != 0) {
            return true;
        }
        return false;
    }

    @Override
    public void makeEmpty() {
        que = null;
    }

}

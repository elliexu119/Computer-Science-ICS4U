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
    Integer back = back();
    Integer front = front();
    boolean empty;

    @Override
    public Integer front() {
        return 0; 
    }

    public Queue(int size) {
        que = new Integer[size];
        back = 0;
        front = 0;
        empty = true;
    }

    @Override
    public Integer back() {
        return -1; 
    }

    @Override
    public boolean enqueue(Integer value) {

        if (isFull()) {
            System.out.println("queue is full");
            return false;
        } else {
            que[back] = value;
            back++;
            if (back == que.length) {
                back = 0;
            }
            empty = false;
            return true;
        }

    }

    @Override
    public Integer dequeue() {
        
        if (front != back || empty == false) {
            Integer ans = que[front];
            front++;
            if (front == que.length) {
                front = 0;
            }
            if (front == back) {
                empty = true;
            }
            return ans;
        } else {
            System.out.println("There's nothing to deque.");
            return -1;
        }
    }

    @Override
    public int size() {
        //System.out.println((back + 1) % capacity());
        if (isFull()) {
            return que.length;
        } else if (back >= front) {
            return back - front;
        } else {
            return que.length - front + back;//(back + 1)%capacity();
        }
    }

    @Override
    public int capacity() {
        return que.length;
    }

    @Override
    public boolean isEmpty() {
        return empty;
    }

    @Override
    public boolean isFull() {
        if (front == back && empty == false) {
            return true;
        }
        return false;
    }

    @Override
    public boolean makeEmpty() {
        front = 0;
        back = 0;
        empty = true;
        return true;
    }

}

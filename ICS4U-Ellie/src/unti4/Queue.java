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
        return this.front;
    }

    public Queue(int size) {
        this.que = new Integer[size];
        this.back = -1;
        this.front = -0;
        this.empty = true;
    }

    @Override
    public Integer back() {
        return this.back;
    }

    @Override
    public boolean enqueue(Integer value) {

        if (isFull()) {
            System.out.println("queue is full");
            return false;
        } else {
            this.back++;
            if (this.back == this.que.length) {
                this.back = 0;
            }
            this.que[this.back] = value;

            this.empty = false;
            return true;
        }

    }

    @Override
    public Integer dequeue() {

        if (empty == false) {
            
            if (front == que.length) {
                front = 0;
            }
            if (front == back) {
                empty = true;
            }
            Integer ans = que[front];
            front++;
            return ans;
        } else {
            System.out.println("There's nothing to deque.");
            return -1;
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < que.length; i ++){
            output = output + ("stack[" + i + "] = " + que[i] + " | " );
            if (i == back){
                output = output + ("B");
            }
            if (i == front){
                output = output + ("F");
            }
            output = output + "\n";
        }
        return output;
    }

    @Override
    public int size() {
        //System.out.println((back + 1) % capacity());
//        if (isFull()) {
//            return que.length;
//        } else 
        if (isEmpty()) {
            return 0;
        } else {
            if (back >= front) {
                return back - front +1;
            } else {
                return que.length - front + back +1;
            }
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
        if (size() == capacity()) {
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

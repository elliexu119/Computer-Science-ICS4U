/*
 * Ellie
 * May 2018 
 * creates a queue object. 
 */
package unti4;

/**
 *
 * @author 1xuell
 */
public class Queue implements QueueInterface {

    Integer que[];
    Integer back;
    Integer front;
    boolean empty;

    @Override
    public Integer front() {
        if (!empty){
            return que[front];
        }
        else {
            return null;
        }
    }

    public Queue (){
        //default constructor 
        this.que = new Integer[5];
        this.back = -1;
        this.front = 0;
        this.empty = true;
    }
    
    public Queue(int size) {
        this.que = new Integer[size];
        this.back = -1;
        this.front = 0;
        this.empty = true;
    }

    @Override
    public Integer back() {
        //returns the value at the back of the queue. 
        if (!empty){
            return que[back];
        }
        else {
            return null;
        }
    }

    @Override
    public boolean enqueue(Integer value) {
        //adds a value to the end of the queue. 
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
        //returns and removes the first integer of the queue. 
        if (front == que.length) {
                front = 0;
            }
        if (empty == false) {
            
            if (front == back) {
                empty = true;
            }
            Integer ans = que[front];
            front++;
            return ans;
        } else {
            System.out.println("There's nothing to deque.");
            return null;
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < que.length; i++) {
            output = output + ("stack[" + i + "] = " + que[i] + " | ");
            if (!isEmpty()) {
                if (i == back) {
                    output = output + ("B");
                }
                if (i == front) {
                    output = output + ("F");
                }
            }
            output = output + "\n";
        }
        return output;
    }

    @Override
    public int size() {
        //returns the filled spots of the queue. 
        if (isEmpty()) {
            return 0;
        } else {
            if (back >= front) {
                return back - front + 1;
            } else {
                return que.length - front + back + 1;
            }
        }
    }

    @Override
    public int capacity() {
        //returns the total number of available positions in the queue. 
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
        this.back = -1;
        this.front = -0;
        this.empty = true;
        return true;
    }

}

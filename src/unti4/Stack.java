/*
 * Ellie 
 * may 2018 
 * creates a stack object. 
 */
package unti4;

/**
 *
 * @author 1xuell
 */
public class Stack implements StackInterface{
    
    Integer stack[];
    int pointer = -1; 

    public Stack(int size) {
        stack = new Integer[size];
        pointer = -1; 
    }
    
    public Stack() {
        //default constructor 
        stack = new Integer[10];
        pointer = -1; 
    }

    public String toString(){
        String output = "";
        if (pointer == -1){
            output = "P = -1 \n";
        }
        for (int i = 0; i < stack.length; i ++){
            output = output + ("stack[" + i + "] = " + stack[i] + " | " );
            if (i == pointer){
                output = output + ("P");
            }
            output = output + ("\n");
        }
        return output;
    }

    @Override
    public int top() {
        //returns the value at the top of the stack. 
        if (pointer > -1){
        return stack[pointer];
        }
        else {
            System.out.println("stack is empty");
            return -1; 
        }

    }

    @Override
    public int pop() {
        //returns and removes the value at the top of the stack.
        if (pointer >= 0){
        int ans = stack[pointer];
        stack[pointer] = null;
        pointer --; 
        return ans;
        }
        else {
            System.out.println("there's nothing to pop");
            return -1;
        }
    }

    public boolean push(int value) {
        //enters a new value to the stack. 
        if (this.pointer+1 < this.stack.length){
        this.stack[this.pointer+1] = value; 
        this.pointer ++; 
        return true; 
        }
        else{
            System.out.println("stack is full");
            return false; 
        }
    }

    @Override
    public int size() {
        //returns the number of filled positions in the stack. 
        return this.pointer+1; 
    }

    @Override
    public int capacity() {
        //returns the total number of available positions in the stack. 
        return stack.length;

    }

    @Override
    public boolean isEmpty() {
        if (pointer == -1){
        return true;
        }
        else {
            return false; 
        }
    }

    public boolean isFull() {
        return stack[stack.length - 1] != null;
    }

    @Override
    public void makeEmpty() {
        pointer = -1;
    }
}

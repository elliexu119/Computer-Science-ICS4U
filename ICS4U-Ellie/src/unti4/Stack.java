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
public class Stack implements StackInterface{
    
    Integer stack[];
    int pointer = -1; 

    public Stack(int size) {
        stack = new Integer[size];
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
        return this.pointer+1; 
    }

    @Override
    public int capacity() {
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

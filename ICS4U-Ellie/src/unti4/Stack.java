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

    @Override
    public String toString() {
        return "Stack{" + "stack=" + stack + '}';
    }

    public void sopl(){
        for (int i = 0; i < stack.length; i ++){
            System.out.println("stack[" + i + "] = " + stack[i]);
            
        }
    }
    public int top() {
        if (pointer > -1){
        return stack[pointer];
        }
        else {
            System.out.println("stack is empty");
            return -1; 
        }

    }

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
        if (pointer+1 < stack.length){
        stack[this.pointer+1] = value; 
        pointer ++; 
        return true; 
        }
        else{
            System.out.println("stack is full");
            return false; 
        }
    }

    public int size() {
        return this.pointer+1; 
    }

    public int capacity() {
        return stack.length;

    }

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

    public void makeEmpty() {
        pointer = -1;
    }
}

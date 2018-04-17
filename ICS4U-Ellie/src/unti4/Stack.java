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
    
    int stack[];
    int pointer = -1; 

    public Stack(int size) {
        stack = new int[size];
        pointer = -1; 
    }

    @Override
    public String toString() {
        return "Stack{" + "stack=" + stack + '}';
    }

    public void sopl(){
        for (int i = 0; i < stack.length; i ++){
            System.out.println(stack[i]);
            
        }
    }
    public int top() {
        return stack[size()-1];

    }

    public int pop() {
        int ans = stack[size()-1];
        stack[size()-1] = 0;
        pointer --; 
        return ans;
    }

    public void push(int value) {
        stack[this.pointer+1] = value; 
        pointer ++; 
    }

    public int size() {
        return this.pointer+1; 
    }

    public int capacity() {
        return stack.length;

    }

    public boolean isEmpty() {
        return stack == null;
    }

    public boolean isFull() {
        return stack[stack.length - 1] != 0;
    }

    public void makeEmpty() {
        stack = null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4;

/**
 *
 * @author ellix
 */
public class Stack implements StackInterface {

    int stack[];

    public Stack(int size) {
        stack = new int[size];
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
        return ans;
    }

    public void push(int value) {
        stack[size()] = value; 
    }

    public int size() {
        for (int i = stack.length - 1; i >= 0; i--) {
            if (stack[i] != 0) {
                return i +1;
            }
            if (i == 0){
                return 0; 
            }
        }
        return -1;
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

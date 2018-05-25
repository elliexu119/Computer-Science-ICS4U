/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey;

/**
 *
 * @author 1xuell
 */
public class Parent {

    private boolean state; //true == open, false == closed
    private int tries;
    public int serial = 0; <<<<<<<<<<

    public Parent() {
        state = true;
        tries = 3; 
    }
    
    public String toString(int combo[]) {
        String a = "";
        for (int i = 0; i < combo.length; i++) {
            a += combo[i] + " ";
        }
        return a;
    }

    public void lock() {
        state = false;
    }

    public boolean check(int combo[], int a, int b, int c, int d) {
        if (d == -1 && combo[0] == a && combo[1] == b && combo[2] == c && tries > 0) {
            state = true;
            tries = 3; 
            return state;
        }
        else if (d != -1 && combo[0] == a && combo[1] == b && combo[2] == c && combo[3] == d && tries > 0){
            state = true; 
            tries = 3; 
            return state; 
        }
        tries --; 
        if (tries == 0){
            System.out.println("THIS LOCK IS LOCKED FOREVER...");
        }
        return state; 
    }

    public void setCombo(int combo[], int max){
        for (int i = 0; i < combo.length; i++){
            combo[i] = (int) (Math.random() * max + 1);
        }
    }

    public boolean isState() {
        return state;
    }
}

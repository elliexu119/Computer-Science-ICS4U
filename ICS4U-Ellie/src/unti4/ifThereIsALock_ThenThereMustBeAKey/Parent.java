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

    public boolean state; //true == open, false == closed
    public int combo[];
    public boolean special1 = false;

    public Parent() {
        state = true;
        int temp[] = {(int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10)};
        combo = temp;
    }

    public String getCombo() {
        String a = "";
        for (int i = 0; i < combo.length; i++) {
            a += combo[i] + " ";
        }
        return a;
    }

    public void lock() {
        state = false;
    }

    public boolean unlock(int a, int b, int c) {
        if (special1 == false && combo[0] == a && combo[1] == b && combo[2] == c) {
            state = true;
            return true;
        }
        return state;
    }

}

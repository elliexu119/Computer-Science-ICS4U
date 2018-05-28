/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey.locks;

import unti4.ifThereIsALock_ThenThereMustBeAKey.Config;

/**
 *
 * @author 1xuell
 */
public class Android extends Config {

    private int combo[] = new int[3];
    private boolean first = true;

    public Android() {
        first = true;
        for (int i = 0; i < combo.length; i++) {
            combo[i] = -1;
        }
        //setCombo(combo, 9);
        System.out.println(toString(combo));
    }

    public int[] getCombo() {
        if (first == true) {
            first = false;
            System.out.println("not null");
            return combo;
        } else {
            System.out.println("null");
            return null;
        }
    }

    public void lock() {
        if (combo[0] == -1 && combo[1] == -1 && combo[2] == -1 && combo[3] == -1) {
            System.out.println("can't lock, no combo set");
        } else {
            lock();
        }
    }

    public boolean unlock(int a, int b, int c) {
        return check(combo, a, b, c, -1);
    }

    public boolean configCombo(int a, int b, int c) {
        if (-1 < a && a < 10 && -1 < b && b < 10 && -1 < c && c < 10) {
            return setCombo(combo, a, b, c, -1);
        }
        return false;
    }

}

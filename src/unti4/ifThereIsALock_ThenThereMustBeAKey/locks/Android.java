/*
 * Ellie 
 * May 2018 
 * Configurable lock that has a 3 number combo ranging from 0 - 9. 
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey.locks;

import unti4.ifThereIsALock_ThenThereMustBeAKey.Config;

/**
 *
 * @author 1xuell
 */
public class Android extends Config {

    private int combo[] = new int[3];

    public Android() {
        for (int i = 0; i < combo.length; i++) {
            combo[i] = -1;
        }
    }

    public void lock() {
        if (combo[0] == -1 && combo[1] == -1 && combo[2] == -1) {
            System.out.println("can't lock, no combo set");
            trace(); 
        } else {
            super.lock();
        }
    }

    public boolean unlock(int a, int b, int c) {
        return super.unlock(combo, a, b, c, -1);
    }

    public boolean configCombo(int a, int b, int c) {
        if (-1 < a && a < 10 && -1 < b && b < 10 && -1 < c && c < 10) {
            return setCombo(combo, a, b, c, -1);
        }
        trace(); 
        return false;
    }

}

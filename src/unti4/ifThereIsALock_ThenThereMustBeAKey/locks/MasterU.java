/*
 * Ellie 
 * May 2018 
 * Configurable lock that has a 4 number combo ranging from 0 - 9. 
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey.locks;

import unti4.ifThereIsALock_ThenThereMustBeAKey.Config;

/**
 *
 * @author 1xuell
 */
public class MasterU extends Config {

    private int combo[] = new int[4];
    private boolean first = true;

    public MasterU() {
        //generates a random combo on instantiation 
        setCombo(combo, 9);
        System.out.println(toString(combo));
    }

    public int[] getCombo() {
        //returns the combo only once. 
        if (first == true) {
            first = false;
            trace();
            return combo;
        } else {
            trace(); 
            return null;
        }
    }

    public boolean unlock(int a, int b, int c, int d) {
        return super.unlock(combo, a, b, c, d);
    }

    public boolean configCombo(int a, int b, int c, int d) {
        if (-1 < a && a < 10 && -1 < b && b < 10 && -1 < c && c < 10 && -1 < d && d < 10) {
            return setCombo(combo, a, b, c, d);
        }
        trace(); 
        return false;
    }
}

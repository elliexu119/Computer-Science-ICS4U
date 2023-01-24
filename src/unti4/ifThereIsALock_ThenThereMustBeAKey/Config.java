/*
 * Ellie 
 * May 2018
 * A parent class for the configurable locks. 
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey;

import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class Config extends Parent {

    public boolean setCombo(int combo[], int a, int b, int c, int d) {
        if (isState() == true) {
            combo[0] = a;
            combo[1] = b;
            combo[2] = c;
            if (combo.length == 4) {
                combo[3] = d; 
            }
            return true;
        }
        return false;
    }

}

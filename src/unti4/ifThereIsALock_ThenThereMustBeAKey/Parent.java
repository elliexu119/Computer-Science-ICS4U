/*
 * Ellie
 * May 2018 
 * Parent class for all the locks. Both the configurable and unconfigurable. 
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey;

/**
 *
 * @author 1xuell
 */
public class Parent implements ParentInterface {

    private boolean state; //true == open, false == closed
    private int tries;
    public static int serial = 0;

    public Parent() {
        state = true;
        tries = 3;
        serial++;
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
        trace(); 
    }

    public boolean unlock(int combo[], int a, int b, int c, int d) {
        //unlocks the lock if the combo matches. However locks it forever if 3 attempts have been used. 
        if (d == -1 && combo[0] == a && combo[1] == b && combo[2] == c && tries > 0) {
            state = true;
            tries = 3;
            trace();
            return state;
        } else if (d != -1 && combo[0] == a && combo[1] == b && combo[2] == c && combo[3] == d && tries > 0) {
            state = true;
            tries = 3;
            trace(); 
            return state;
        }
        tries--;
        if (tries == 0) {
            System.out.println("THIS LOCK IS LOCKED FOREVER and ever and ever and ever and ever and ever and ever and ever and ever...");
        }
        trace(); 
        return state;
    }

    public void setCombo(int combo[], int max) {
        for (int i = 0; i < combo.length; i++) {
            combo[i] = (int) (Math.random() * max + 1);
        }
        trace(); 
    }

    public boolean isState() {
        trace(); 
        return state;
    }

    public void trace() {
        //outputs the stats of the lock. 
        System.out.println("----------------------------");
        System.out.println("Serial Number: " + serial);
        if (state == true) {
            System.out.println("UNLOCKED");
        } else {
            System.out.println("LOCKED");
        }
        System.out.println("----------------------------");
    }
}

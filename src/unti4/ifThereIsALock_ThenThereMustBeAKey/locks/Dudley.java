/*
 * Ellie 
 * May 2018 
 * Unconfigurable lock that has a 3 number combo ranging from 0 - 59. 
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey.locks;

import unti4.ifThereIsALock_ThenThereMustBeAKey.Parent;

/**
 *
 * @author 1xuell
 */
public class Dudley extends Parent {
    private int combo[] = new int[3];
    private boolean first = true; 
    
    public Dudley() {
        //generates a random combo on instantiation 
        setCombo(combo, 59); 
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
    
    public boolean unlock(int a , int b, int c){
        return super.unlock(combo, a, b, c, -1);
    }

}

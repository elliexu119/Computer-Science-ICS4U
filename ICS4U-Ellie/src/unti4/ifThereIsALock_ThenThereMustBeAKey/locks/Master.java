/*
 * Ellie 
 * May 2018 
 * Unconfigurable lock that has a 3 number combo ramging from 0 - 39. 
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey.locks;
import unti4.ifThereIsALock_ThenThereMustBeAKey.Parent;

/**
 *
 * @author 1xuell
 */
public class Master extends Parent{

    private int combo[] = new int[3];
    private boolean first = true; 
    
    public Master() {
        //generates a random combo on instantiation 
        setCombo(combo, 39); 
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        setCombo(combo, 39); 
        System.out.println(toString(combo));
    }
    
    public int[] getCombo() {
        if (first == true) {
            first = false;
            return combo;
        } else {
            return null;
        }
    }
    
    public boolean unlock(int a , int b, int c){
        return check(combo, a, b, c, -1);
    }
    
}

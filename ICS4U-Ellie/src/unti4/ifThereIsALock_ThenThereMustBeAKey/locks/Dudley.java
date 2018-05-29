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
public class Dudley extends Parent {
    private int combo[] = new int[3];
    private boolean first = true; 
    
    public Dudley() {
        setCombo(combo, 59); 
        System.out.println(toString(combo));
    }
    
    public int[] getCombo() {
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

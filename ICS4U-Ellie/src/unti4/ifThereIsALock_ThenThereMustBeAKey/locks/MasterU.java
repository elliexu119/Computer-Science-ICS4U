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
public class MasterU extends Config {

    private int combo[] = new int[4];
    private boolean first = true;
    
    public MasterU() {
        setCombo(combo, 9); 
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
    
    public boolean unlock(int a , int b, int c, int d){
        return check(combo, a, b, c, d);
    }

    public boolean configCombo(int a, int b, int c, int d){
        if (-1 < a && a < 10 && -1 < b && b < 10 && -1 < c && c < 10 && -1 < d && d < 10){
            return setCombo(combo, a, b, c, d);
        }
        return false; 
    }
}

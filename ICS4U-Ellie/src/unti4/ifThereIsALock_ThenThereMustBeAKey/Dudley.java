/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey;

/**
 *
 * @author 1xuell
 */
public class Dudley extends Fixxed{

    public Dudley() {
        combo = new int[3]; 
        for (int i = 0; i < 3; i++){
            combo[i] = (int) (Math.random()*60);
        } 
        int a[] = {1, 2, 3}; 
    }
    
}

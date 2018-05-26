/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey;

/**
 *
 * @author ellix
 */
public interface ParentInterface {
    
    public boolean isState();
    public void setCombo(int combo[], int max);
    public boolean check(int combo[], int a, int b, int c, int d);
    public void lock();
    public String toString(int combo[]);
    
    
}

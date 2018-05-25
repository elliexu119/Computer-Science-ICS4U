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
public class MasterU extends Config {

    public MasterU() {
        int temp[] = {(int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10)};
        combo = temp;
        System.out.println(getCombo());
        special1 = true;
    }

    public boolean unlock(int a, int b, int c, int d) {
        if (combo[0] == a && combo[1] == b && combo[2] == c && combo[3] == d) {
            state = true;
            return true;
        }
        return state;
    }

}

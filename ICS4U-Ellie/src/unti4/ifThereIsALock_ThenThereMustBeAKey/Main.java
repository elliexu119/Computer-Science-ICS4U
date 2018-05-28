/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.ifThereIsALock_ThenThereMustBeAKey;

import unti4.ifThereIsALock_ThenThereMustBeAKey.locks.Dudley;
import unti4.ifThereIsALock_ThenThereMustBeAKey.locks.MasterU;
import java.util.Scanner;
import unti4.ifThereIsALock_ThenThereMustBeAKey.locks.Android;
import unti4.ifThereIsALock_ThenThereMustBeAKey.locks.Master;

/**
 *
 * @author 1xuell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        android();
        master(); 
        dudley();
        masteru(); 
        
    }
    
    public static void android(){
        System.out.println("ANDROID");
        Android lock = new Android ();
        lock.lock(); 
        int password [] = lock.getCombo();
        
        assert (lock.unlock(-1, -1, -1) == false);
        assert (lock.getCombo() == null);
        assert (lock.configCombo(1, 1, 1) == false);
        
        assert (lock.unlock(password[0], password[1], password[2]) == true);
        assert (lock.configCombo(10, 12, 14) == false);
        assert (lock.configCombo(2,2,2) == true);
        password = lock.getCombo();
        
        for (int i = 0; i < password.length; i ++){
            System.out.print(password[i] + " ");
        }
        
        System.out.println("");
        lock.lock();
        assert(lock.getCombo() == null);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(password[0], password[1], password[2]) == false);
        assert(lock.isState() == false);
        System.out.println("Serial num: " + lock.serial);
        System.out.println("");
    }
    
    public static void master(){
        System.out.println("MASTER");
        Master lock = new Master(); 
        lock.lock(); 
        int password [] = lock.getCombo(); 
        
        assert (lock.unlock(-1, -1, -1) == false);
        assert (lock.getCombo() == null);
        assert (lock.unlock(password[0], password[1], password[2]) == true);
        
        lock.lock();
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(password[0], password[1], password[2]) == false);
        assert(lock.isState() == false); 
        System.out.println("Serial num: " + lock.serial);
        System.out.println("");
    }
    
    public static void dudley(){
        System.out.println("DUDLEY");
        Dudley lock = new Dudley();
        lock.lock();
        int password [] = lock.getCombo();
        
        assert(lock.unlock(-1, -1, -1) == false);
        assert (lock.getCombo() == null);
        assert(lock.unlock(password[0], password[1], password[2]) == true);
        
        lock.lock();
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1) == false);
        assert(lock.unlock(password[0], password[1], password[2]) == false);
        assert(lock.isState() == false); 
        System.out.println("Serial num: " + lock.serial);
        System.out.println("");    
    }
    public static void masteru(){
        System.out.println("MASTERU");
        MasterU lock = new MasterU();
        lock.lock(); 
        int password [] = lock.getCombo();
        
        assert (lock.unlock(-1, -1, -1, -1) == false);
        assert (lock.getCombo() == null);
        assert (lock.configCombo(1, 1, 1, 1) == false);
        
        assert (lock.unlock(password[0], password[1], password[2], password[3]) == true);
        assert (lock.configCombo(10, 12, 14, 2) == false);
        assert (lock.configCombo(2,2,2,2) == true);
        password = lock.getCombo();
        
        for (int i = 0; i < password.length; i ++){
            System.out.print(password[i] + " ");
        }
        
        System.out.println("");
        lock.lock();
        assert(lock.getCombo() == null);
        assert(lock.unlock(-1, -1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1, -1) == false);
        assert(lock.unlock(-1, -1, -1, -1) == false);
        assert(lock.unlock(password[0], password[1], password[2], password[3]) == false);
        assert(lock.isState() == false); 
        System.out.println("Serial num: " + lock.serial);
        System.out.println("");
    }
}

/*
 * Ellie X
 * 8 days before March 1, 2018 
 * finds prime numbers from 1 - 1000; 
 */
package unit1;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author ellix
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        boolean numbers[] = new boolean [10000];
        for (int i = 2; i < numbers.length; i++){
            if (numbers[i] == false){
                System.out.println(i);
                for (int a = i; a < numbers.length; a++){
                    if (numbers[a] == false && a%i == 0){
                        numbers[a] = true; 
                    }
                }
            }
        }
    }
}
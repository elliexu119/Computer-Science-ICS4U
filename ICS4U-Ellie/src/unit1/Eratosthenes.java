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
        boolean numbers[] = new boolean [1000];
        System.out.println(numbers[3]);
        File file = new File("Eratosthenes.txt");
        PrintWriter writer = new PrintWriter(file);
        
        for (int i = 2; i < 1000; i++){
            if (numbers[i] == false){
                writer.write(i + " "); 
                for (int a = i; a < 1000; a++){
                    if (numbers[a] == false && a%i == 0){
                        numbers[a] = true; 
                    }
                }
            }
        }
        writer.close();
    }

}

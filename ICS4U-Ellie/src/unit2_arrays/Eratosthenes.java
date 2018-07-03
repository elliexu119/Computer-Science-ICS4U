/*
 * Ellie X
 * Feb. 21, 2018 
 * finds prime numbers from 1 - 1000; 
 */
package unit2_arrays;

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
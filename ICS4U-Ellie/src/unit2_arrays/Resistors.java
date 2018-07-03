/*
 * You know who I am 
 * Feb 21, 2018
 * finds resistor values
 */
package unit2_arrays;

import java.util.Scanner;
import java.util.StringTokenizer;
import static resources.SOPL.sopl;

/**
 *
 * @author ellix
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables 
        Scanner input = new Scanner(System.in);
        String[] values = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        String code = input.nextLine(); //e.g. red-yellow-brown 
        String numbers = "";
        int answer = 0; 

        //turning the colours to a value  
        StringTokenizer hyphens = new StringTokenizer(code, "-");
        for (int j = 0; j < 3 && hyphens.hasMoreTokens(); j++) {
            String token = hyphens.nextToken();
            for (int i = 0; i < values.length; i++) {
                if (token.trim().equalsIgnoreCase(values[i])) {
                    if (numbers.length() < 2) {
                        numbers = numbers + i;
                        break;
                    } else if (numbers.length() == 2) {
                        answer = Integer.parseInt(numbers) * i*10;
                        if (i == 0){
                            answer = Integer.parseInt(numbers); 
                        }
                    } else {
                        sopl("too many colours, too little values");
                    }
                }
            }
        }
        sopl("the value of the resistor is " + answer + " ohms.");
    }

}

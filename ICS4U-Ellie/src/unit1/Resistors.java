/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1;

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
        String[] values = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        Scanner input = new Scanner(System.in);
        String code = input.nextLine();
        String numbers = "";
        int answer = 0; 

        StringTokenizer hyphens = new StringTokenizer(code, "-");
        while (hyphens.hasMoreTokens()) {
            String token = hyphens.nextToken();

            for (int i = 0; i < values.length; i++) {
                if (token.trim().equalsIgnoreCase(values[i])) {
                    if (numbers.length() < 2) {
                        numbers = numbers + i;
                        break;
                    } else if (numbers.length() == 2) {
                        answer = Integer.parseInt(numbers) * i*10;
                    } else {
                        sopl("too many colours, too little values");
                    }
                }
            }

        }
        sopl("the value of the resistor is " + answer + " ohms.");
    }

}

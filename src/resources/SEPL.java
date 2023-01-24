/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author john
 */
public class SEPL {

    /**
     * @param args the command line arguments
     */

    public static void sep(String a) {
        System.err.print(a);
    }

    public static void sep(int a) {
        System.err.print(a);
    }

    public static void sep(double a) {
        System.err.print(a);
    }

    public static void sepl(String a) {
        System.err.println(a);
    }

    public static void sepl(int a) {
        System.err.println(a);
    }

    public static void sepl(double a) {
        System.err.println(a);
    }

    public static void sepl(double number[]) {
        for (int i = 0; i < number.length; i++) {
            sep(number[i] + " ");
        }
        sep("\n");
    }

    public static void sepl(int number[]) {
        for (int i = 0; i < number.length; i++) {
            sep(number[i] + " ");
        }
        sep("\n");
    }

    public static void sepl(String number[]) {
        for (String number1 : number) {
            sep(number1 + " ");
        }
        sep("\n");
    }

    public static void sep(double number[]) {
        for (int i = 0; i < number.length; i++) {
            sep(number[i] + " ");
        }
    }

    public static void sep(int number[]) {
        for (int i = 0; i < number.length; i++) {
            sep(number[i] + " ");
        }
    }

    public static void sep(String number[]) {
        for (String number1 : number) {
            sep(number1 + " ");
        }
    }
    
}

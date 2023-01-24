/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author 1xuell
 */
public class SOPL {

    public static void sop(String a) {
        System.out.print(a);
    }

    public static void sop(int a) {
        System.out.print(a);
    }
public static void sop(char a) {
        System.out.print(a);
    }
    public static void sop(double a) {
        System.out.print(a);
    }

    public static void sopl(String a) {
        System.out.println(a);
    }

    public static void sopl(int a) {
        System.out.println(a);
    }

    public static void sopl(double a) {
        System.out.println(a);
    }
    public static void sopl(char a) {
        System.out.println(a);
    }

    public static void sopl(double number[]) {
        for (int i = 0; i < number.length; i++) {
            sop(number[i] + " ");
        }
        sop("\n");
    }

    public static void sopl(int number[]) {
        for (int i = 0; i < number.length; i++) {
            sop(number[i] + " ");
        }
        sop("\n");
    }

    public static void sopl(String number[]) {
        for (int i = 0; i < number.length; i++) {
            sop(number[i] + " ");
        }
        sop("\n");
    }

    public static void sop(double number[]) {
        for (int i = 0; i < number.length; i++) {
            sop(number[i] + " ");
        }
    }

    public static void sop(int number[]) {
        for (int i = 0; i < number.length; i++) {
            sop(number[i] + " ");
        }
    }

    public static void sop(String number[]) {
        for (String number1 : number) {
            sop(number1 + " ");
        }
    }
    public static void sopl(String a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int e = 0; e < a[i].length; e++) {
                System.out.print(a[i][e] + " ");
            }
            System.out.println("");
        }
    }

    public static void sopl(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int e = 0; e < a[i].length; e++) {
                System.out.print(a[i][e] + " ");
            }
            System.out.println("");
        }
    }

    public static void sopl(double a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int e = 0; e < a[i].length; e++) {
                System.out.print(a[i][e] + " ");
            }
            System.out.println("");
        }
    }
}

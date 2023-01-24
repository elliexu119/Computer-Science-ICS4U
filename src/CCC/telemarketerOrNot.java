package CCC;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1xuell
 */
public class telemarketerOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        String output = "answer";

        if ((one == 8 || one == 9) && (four == 8 || four == 9) && (two == three)){
            output="ignore";
        }
        System.out.println(output);

    }
}

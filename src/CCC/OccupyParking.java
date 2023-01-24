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
public class OccupyParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int spaces = Integer.parseInt(input.nextLine());
        String yesterday = input.nextLine();
        String today = input.nextLine();
        int counter = 0;

        for (int i = 0; i < spaces; i++) {
            if (yesterday.charAt(i) == today.charAt(i) && yesterday.charAt(i) != '.') {
                counter++;
            }
        }
        System.out.println(counter);

    }

}

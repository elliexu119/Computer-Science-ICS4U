package resources;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 246;
        int one = n/ 100;
        int two = (n % 100 - (n % 100) % 10) / 10;
        int three = (n % 100) % 10;
        int sum = one + two + three;

        System.out.println("the original number is: " + n);
        System.out.println("and the sum of its digits is: " + sum);
    }
}

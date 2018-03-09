/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.math.BigInteger;

/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fact(10000)); 
    }

    public static BigInteger fact(int n) {
        if (n < 0) {
            return BigInteger.valueOf(-1);
        }
        if (n < 2) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1;

import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String string = "1 2 3";
        //StringTokenizer token = new StringTokenizer(string, "2");
        //while (token.hasMoreTokens()) {
        //    System.out.println(token.nextToken());
        //}
        String word = "cat";
        sopl(word.length());
        sopl(word.charAt(2)); 
    }
    
}

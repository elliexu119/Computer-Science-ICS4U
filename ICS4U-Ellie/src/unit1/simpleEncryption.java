/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1;

import java.util.Scanner;
import java.util.StringTokenizer;
import static resources.SOPL.sop;
import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class simpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase = "", word, newWord = "", newPhrase = "";
        int rotation = 0, cryption = 0;

        sop("Enter in the phrase: ");
        phrase = input.nextLine();
        sop("Enter the rotation amount: ");
        rotation = input.nextInt();
        sopl("1 - Encryption \n2 - Decryption");
        cryption = input.nextInt();

        StringTokenizer token = new StringTokenizer(phrase);
        while (token.hasMoreTokens()) {
            word = token.nextToken().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                if (cryption == 1) {
                    int a  = character + rotation;
                    if (a >= 122){
                        sopl(a);
                        a = a -23;
                        sopl(a);
                    }
                    character = (char) a;
                }
                if (cryption == 2) {
                    int a  = character - rotation; 
                    character = (char) a;
                }
                newWord = newWord + character;
            }
            newPhrase = newPhrase + newWord + " ";
            newWord = ""; 
        }
        sopl(newPhrase);
    }

}

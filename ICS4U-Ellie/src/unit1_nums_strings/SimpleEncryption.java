/*
 * Ellie 
 * Tuesday, Feb 20, 2018
 * does simple encryption on phrases 
 */
package unit1_nums_strings;

import java.util.Scanner;
import java.util.StringTokenizer;
import static resources.SOPL.sop;
import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase = "", word, newWord = "", newPhrase = "";
        int rotation = 0, cryption = 0;

        //input
        sop("Enter in the phrase: ");
        phrase = input.nextLine();
        sop("Enter the rotation amount: ");
        rotation = input.nextInt();
        sopl("1 - Encryption \n2 - Decryption");
        cryption = input.nextInt();

        //encryption 
        StringTokenizer token = new StringTokenizer(phrase);
        while (token.hasMoreTokens()) {
            word = token.nextToken().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                if (cryption == 1) {
                    int a  = character + rotation;
                    if (a >= 123){
                        a = a -26;
                    }
                    character = (char) a;
                }
                if (cryption == 2) {
                    int a  = character - rotation; 
                    if (a <= 96){
                        a = a+26;
                    }
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

/*
 * Ellie
 * Thursday, Feb 8, 2018
 * finds happy and sad faces in a string
 */
package unit1_nums_strings;

import java.util.Scanner;
import static resources.SOPL.sop;
import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class HappySad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String original = "", phrase = "";
        int happy = 0, sad = 0, sub1 = 0;

        //user input
        sop("Enter in the phrase: ");
        original = input.nextLine();
        phrase = original;
        
        //finding the happy faces 
        while (phrase.indexOf(":-)") != -1) {
            phrase = phrase.substring(sub1, phrase.length()) + " ";
            phrase = phrase.trim();
            sub1 = phrase.indexOf(":-)");
            happy++;
            sub1++;
        }
        happy--;

        //finding the sad faces
        sub1 = 0;
        phrase = original;
        while (phrase.indexOf(":-(") != -1) {
            phrase = phrase.substring(sub1, phrase.length()) + " ";
            phrase = phrase.trim();
            sub1 = phrase.indexOf(":-(");
            sub1++;
            sad++;
        }
        sad--;

        //outputting an answer 
        if (sad > happy) {
            sopl("sad");
        } else if (sad < happy) {
            sopl("happy");
        } else if (sad == happy && sad != 0) {
            sopl("unsure");
        } else {
            sopl("none");
        }
    }

}

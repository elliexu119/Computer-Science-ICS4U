/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int happy = 0, sad = 0, sub1 = 0, sub2 = 0;

        sop("Enter in the phrase: ");
        original = input.nextLine();
        
        phrase = original;
        while (sub1 != -1) {
            sub1++;
            sub2 = sub1;
            phrase = phrase.substring(sub1, phrase.length()) + " ";
            phrase = phrase.trim();
            sub1 = phrase.indexOf(":-)");
            happy++;
        }
        happy--;

        sub1 = 0;
        sub2 = 0;
        phrase = original;
        while (sub1 != -1) {
            sub1++;
            sub2 = sub1;
            phrase = phrase.substring(sub1, phrase.length()) + " ";
            phrase = phrase.trim();
            sub1 = phrase.indexOf(":-(");
            sad++;
        }
        sad--;
        
        if (sad > happy){
            sopl("sad");
        }
        else if (sad < happy){
            sopl("happy");
        }
        else if (sad == happy && sad != 0){
            sopl("unsure");
        }
        else {
            sopl("none");
        }
    }

}

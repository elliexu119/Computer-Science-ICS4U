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
public class palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //palindrome 1, 2, and 3 
        String word = null, newSentence = "", newWord = "";
        int end, start = 0, a = 0;
        boolean palindrome = false;
        Scanner input = new Scanner(System.in);

        sop("enter the word: ");
        word = input.nextLine();
        
        sopl ("the palindrome words are: ");
        StringTokenizer token = new StringTokenizer(word);
        while (token.hasMoreTokens()) {
            newWord = token.nextToken();
            if (check(newWord, start, newWord.length() - 1)) {
                sopl(newWord);
                start = 0;
                a = 1; 
            }
            newSentence = newSentence + newWord.toUpperCase();
        }
        end = newSentence.length() - 1;
        palindrome = check(newSentence, start, end);
        
        if (a == 0){
            sopl("N/A");
        }
        if (palindrome == false) {
            sopl("the sentence is NOT a palindrome");
        } else {
            sopl("the sentence IS a palindrome");
        }
    }

    public static boolean check(String string, int start, int end) {
        boolean check = false;
        while (string.charAt(start) == (string.charAt(end))) {
            start++;
            end--;
            if (end <= start) {
                check = true;
                break;
            }
        }
        return check;
    }

}

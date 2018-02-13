/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1;

import java.io.File;
import java.util.Scanner;
import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class rottenTomatoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       wordCount(); 
    }

    public static void wordCount() throws Exception {
        File reviews = new File("rotten tomatoes testing data.txt");
        Scanner lines = new Scanner (reviews);
        Scanner file = new Scanner (reviews);
        int lineCount = 0; 
        String[] sentence;
        while (lines.hasNext()){
            lineCount ++; 
            lines.nextLine(); 
        }
        sopl(lineCount);
        sentence = new String [lineCount];
        
        lineCount = 0; 
        while (file.hasNext()){
            sentence [lineCount] = (file.nextLine());
            lineCount++; 
        }
        for(int i = 0; i < sentence.length; i++){
            sopl(sentence[i]);
        }

    }

}

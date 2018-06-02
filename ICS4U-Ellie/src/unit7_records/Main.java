/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7_records;

/**
 *
 * @author 1xuell
 */
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Records a = new Records("Eye of the tiger", "Survivor", 1982, 3.5, true);
        Records b = new Records("Thunderstruck", "AC/DC", 1990, 3.2, false);
        Records c = new Records("Back in black", "AC/DC", 1980, 5, false);
        Records master = new Records(); 

        master.write(a); 
        master.write(b);
        master.write(c);
        master.read(0, a); 
        System.out.println("");
        master.read(master.length()/3, b);
        System.out.println("");
        master.read(master.length()/3*2  , c);

        
        //read(0, a, file);
        //read(a.RECORD_SIZE, b, file);
//        for (int i = 59; i < b.SONG_SIZE * 2 + 59 ; i = i + 2) {
//            file.seek(i);
//            System.out.print(file.readChar());
//        }
        
        
    }
}

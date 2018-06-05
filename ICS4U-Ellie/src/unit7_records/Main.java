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

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Records a = new Records("Eye of the tiger", "Survivor", 1982, 3.5, true);
        Records b = new Records("Thunderstruck", "AC/DC", 1990, 3.2, true);
        Records c = new Records("Back in black", "AC/DC", 1980, 5, false);

        RandomAccess file = new RandomAccess("song_info.txt");
        
        System.out.println(file.length());
        file.write(a);
        System.out.println(file.length());
        file.write(b);
        file.write(c);
//        file.seek(0);
//        read(file, a);
//        System.out.println("");
//        read(file, b);
//        System.out.println("");
//        read(file, c);
        
        System.out.println(file.length());
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7_records;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        
        Records a = new Records("Eye of the tiger", "Survivor", 1982, 3.5, true);
        Records b = new Records("Thunderstruck", "AC/DC", 1990, 3.2, true);
        Records c = new Records("Back in black", "AC/DC", 1980, 4, false);
        Records d = new Records("Ghostbusters", "Ray Parker Jr.", 1984, 4, false);
        assert(a.getid() == -1);
        File file2 = new File( "song_info.txt");
        file2.delete();        
        DataBase file = new DataBase("song_info.txt");
        file.open();
        
        assert(file.get(2).getSong() .trim().equals ("TBD"));
        assert(file.length() == 0);
        file.save(a);
        assert(a.getid() == 0);
        file.save(b);
        file.save(c);
        assert(file.get(2).getSong() .trim().equals ("Back in black"));
        assert(file.get(0).getSong().trim().equals("Eye of the tiger"));
        assert(file.get(1).getSong().trim().equals("Thunderstruck"));
        file.save(d);
        assert(file.get(3).getSong().trim().equals("Ghostbusters")); 
        assert(file.length() == 115*4);
        assert(file.get(8).getSong() .trim().equals ("TBD"));
        
        assert(file.get(0).getFavourite());
        a.setFavourite(false);
        file.save(a);
        assert(file.get(0).getFavourite() == false);
        
        String end = input.nextLine();
        file.close();
    }

    
}

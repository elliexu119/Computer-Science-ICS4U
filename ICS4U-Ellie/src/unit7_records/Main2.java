/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7_records;

/**
 *
 * @author ellix
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DataBase file = new DataBase("song_info.txt");
        file.open();
Records a = new Records("Eye of the tiger", "Survivor", 1982, 3.5, true);
file.save(a); 
        

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7_records;

import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author ellix
 */
public class RandomAccess {
    private RandomAccessFile file;

    public RandomAccess(String file) throws Exception {
        this.file = new RandomAccessFile(file, "rw");
    }
 
    public void write(Records records) throws Exception {
        file.writeChars(records.getSong());
        file.writeChars(records.getWriter());
        file.writeInt(records.getYear());
        file.writeDouble(records.getRating());
        file.writeBoolean(records.getFavourite());
    }

    public void read(Records records) throws Exception {
        
        char array[] = new char[records.SONG_SIZE];
        for (int i = 0; i < records.SONG_SIZE; i++) {
            array[i] = file.readChar();
        }
        System.out.println((new String(array)));

        array = new char[records.WRITER_SIZE];
        for (int i = 0; i < records.WRITER_SIZE; i++) {
            array[i] = file.readChar();
        }
        System.out.println((new String(array)));
        System.out.println(file.readInt());
        System.out.println(file.readDouble());
        System.out.println(file.readBoolean());
    }
    
    public long length()throws Exception {
        return file.length(); 
    }
    
    public void update() throws Exception {
        System.out.println("which record would you like to update?");
        for (int i = 0; i < file.length(); i ++){
            
        }
        Scanner input = new Scanner (System.in);
        int index = input.nextInt();
        
        
    }
}
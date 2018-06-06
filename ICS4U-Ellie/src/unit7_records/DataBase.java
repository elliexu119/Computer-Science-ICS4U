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
public class DataBase extends Parent {

    private RandomAccessFile file;
    private static boolean open = false; 
    private static boolean closed = true; 

    public DataBase(String file) throws Exception {
        if (open == true){
            open = false; 
            this.file = new RandomAccessFile(file, "rw");
        }
        else {
            System.out.println("This file is opened elsewhere.");   
        }
    }
    
    public void open(){
        if (closed == true){
            open = true;
            closed = false;
        }
    }
    
    public void close(){
        if (open == true){
            open = false; 
            closed = true; 
        }
    }

    public void save(Records records) throws Exception {
        if (records.getid() == -1){
            file.seek(file.length());
            write(records); 
        }
        else {
            file.seek(file.length() * (records. getid()));
            write(records); 
        }
    }
    
    public void write(Records records) throws Exception {
        file.writeChars(records.getSong());
        file.writeChars(records.getWriter());
        file.writeInt(records.getYear());
        file.writeDouble(records.getRating());
        file.writeBoolean(records.getFavourite());
        records.setid(((int) file.length()/RECORD)-1);
    }

    public Records get(long index) throws Exception {
        if ((file.length() / RECORD) > index) {
            
            file.seek(index * RECORD);
            char array[] = new char[SONG_SIZE];
            for (int i = 0; i < SONG_SIZE; i++) {
                array[i] = file.readChar();
            }
            String song = ((new String(array)));

            array = new char[WRITER_SIZE];
            for (int i = 0; i < WRITER_SIZE; i++) {
                array[i] = file.readChar();
            }
            
            return new Records (song, (new String(array)), file.readInt(), file.readDouble(), file.readBoolean()); 
        } else {
            return new Records ("TBD", "TBD", 0, 0, false);
        }
    }

    public long length() throws Exception {
        return file.length();
    }
}

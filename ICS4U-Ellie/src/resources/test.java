package resources;

import java.io.File;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         boolean numbers[] = new boolean [1000];
        System.out.println(numbers[3]);
        File file = new File("Eratosthenes.txt");
        PrintWriter writer = new PrintWriter(file);
        
        writer.write("dskjkfhdsf");
        writer.close();
    }
}

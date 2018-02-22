package resources;

import java.util.ArrayList;

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
        ArrayList <String> list = new ArrayList(); 
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.indexOf("c"));
        
        Object[] array = list.toArray();
    }
}

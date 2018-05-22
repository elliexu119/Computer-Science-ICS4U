/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import unit5.Student;

/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int random = (int) (Math.random() * 6);
        while ( random != 7 ){
            random = (int) (Math.random() * 6);
            System.out.println(random);
        }
        System.out.println( random );
    }

}
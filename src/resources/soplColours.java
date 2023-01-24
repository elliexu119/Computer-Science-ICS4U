/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author 1xuell
 */
public class soplColours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String RESET = "\u001B[0m";

        //SOPL
        String BLACK = "\u001B[30m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";

        //BACKGROUNDS
        String BLACKb = "\u001B[40m";
        String REDb = "\u001B[41m";
        String GREENb = "\u001B[42m";
        String YELLOWb = "\u001B[43m";
        String BLUEb = "\u001B[44m";
        String PURPLEb = "\u001B[45m";
        String CYANb = "\u001B[46m";
        String WHITEb = "\u001B[47m";

        System.out.println(GREENb + RED + "This text has red text but a green background!" + RESET);
    }

}

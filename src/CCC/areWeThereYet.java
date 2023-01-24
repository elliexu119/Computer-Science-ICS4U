package CCC;


import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1xuell
 */
public class areWeThereYet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        
        Integer[] distances = new Integer[4];
        StringTokenizer token = new StringTokenizer(line);
                   int i = 0;

        while (token.hasMoreTokens()){
            distances[i] = Integer.parseInt(token.nextToken());
            i++; 
        }


        int sub = distances[0] + distances[1];
        int sub2 = distances[0] + distances[1] + distances[2];
        int sub3 = distances[0] + distances[1] + distances[2] + distances[3];
        System.out.println("0 " + distances[0] + " " + sub + " " + sub2 + " " + sub3);
        
        sub = distances[1] + distances[2];
        sub2 = distances[1] + distances[2] + distances[3];
        System.out.println(distances[0] + " 0 " + distances[1] + " " + sub + " " + sub2);
        
        sub = distances[0]+distances[1];
        sub2 = distances[2] + distances [3];
        System.out.println(sub + " " + distances[1] + " 0 " + distances[2] + " " + sub2);
        
        sub = distances[2]+distances[1] + distances[0] ;
        sub2 = distances[2] + distances [1];
        System.out.println(sub + " " + sub2 + " " + distances[2] + " 0 " + distances[3]);
        
        sub = distances[3] + distances[2] + distances[1] + distances[0] ;
        sub2 = distances[3] + distances[2] + distances[1];
        sub3 = distances[3] + distances[2];
        System.out.println(sub + " " + sub2 + " " + sub3 + " " + distances[3] + " 0 ");
    }
    

}

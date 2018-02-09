/*
 * Ellie
 * Thursday, Feb 8, 2018
 * calculate date of easter 
 */
package unit1;

import static resources.SOPL.sop;
import static resources.SOPL.sopl;
import java.util.Scanner;

/**
 *
 * @author ellix
 */
public class easter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 0, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
        int h = 0, i = 0, j = 0, k = 0, m = 0, p = 0, month = 0, day = 0;
        sop("year: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        a = year%19; 
        b = year/100;
        c = year%100; 
        d = b/4; 
        e = b%4;
        f = (b+8)/25;
        g = (b-f+1)/3;
        h = (19*a+b-d-g+15)%30;
        i = c/4;
        k = c%4;
        j = (32+2*e+2*i-h-k)%7;
        m = (a+11*h+22*j)/451; 
        month = (h+j-7*m+114)/31;
        p = (h+j-7*m+114)%31;
        day = p+1; 
        
        switch (month){
            case 3:
                sop ("March ");
                break;
            case 4: 
                sop ("April ");
        }
        sopl(day);

    }

}

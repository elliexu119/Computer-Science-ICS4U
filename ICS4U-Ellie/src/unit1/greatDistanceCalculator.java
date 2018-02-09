/*
 * Ellie
 * Thursday, Feb 8, 2018
 * calculates distance between two points on earth
 */
package unit1;

import static resources.SOPL.sop;
import static resources.SOPL.sopl;
import java.util.Scanner;

/**
 *
 * @author ellix
 */
public class greatDistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lat1 = 0, lat2 = 0, lon1 = 0, lon2 = 0; 
        float distance = 0; 
        int choice; 
        Scanner input = new Scanner(System.in);
        sopl("type in 0 degrees, 1 for radians");
        choice = input.nextInt();
        sop("latitude1: ");
        lat1 = input.nextDouble();
        sop("longitude1: ");
        lon1 = input.nextDouble();
        sop("latitude2: ");
        lat2 = input.nextDouble();
        sop("longitude2: ");
        lon2 = input.nextDouble();
        if (choice == 0){
            lat1 = Math.toRadians(lat1);
            lon1 = Math.toRadians(lon1);
            lat2 = Math.toRadians(lat2);
            lon2 = Math.toRadians(lon2);
        }
            distance = (float)Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon2 - lon1)); 
            sopl("the distance is " + distance*6378.8 + "km");
    }
    
}

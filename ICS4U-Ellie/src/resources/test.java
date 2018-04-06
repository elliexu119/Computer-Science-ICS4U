/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.ArrayUtilEllie.binarySearch;
import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String search[] = {"a", "b", "c", "d", "e","f","g","h","i","j","k","l"};
//sopl("a".compareTo("b"));       
int search2[] = {1,2,3,4,5,6,7,8,9,10,11,12};
sopl(binarySearch(search2, 12, (int) search.length / 2 - 1));
    }


}

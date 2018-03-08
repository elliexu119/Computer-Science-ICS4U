/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.StringTokenizer;
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
        int[][] data = {
            {7, 22, 1, 33},
            {5, 3, 10, 4},
            {66, 44, 2, 55}
        };
        sopl(sumCross(data, 1, 2));
    }

    public static int sumCross(int[][] data, int rowIndex, int colIndex) {
        int sum = 0; //1,2
        for (int i = 0; i < data[rowIndex].length; i++) {
            sum = sum + data[rowIndex][i];
            sopl(data[rowIndex][i]);
        }
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i][colIndex];
        }
        sum = sum - data[rowIndex][colIndex];
        return sum;
    }

}

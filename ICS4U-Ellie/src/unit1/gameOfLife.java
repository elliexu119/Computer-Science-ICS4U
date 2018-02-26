/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1;

import java.util.Scanner;
import static resources.SOPL.sop;
import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class gameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random1, random2, size = 20; 
        int[][] grid = new int[size][size];
        int[][] grid2 = new int[size][size];
        sopl("initial population? ");
        int num = input.nextInt();
        for (int i = 0; i < num + 1; i++) {
            random1 = (int) (Math.random() * size);
            random2 = (int) (Math.random() * size); 
            grid[random1][random2] = 1;
            grid2[random1][random2] = 1;
        }

        for (int i = 0; i < grid2.length; i++) {
            for (int a = 0; a < grid2[i].length; a++) {
                int counter = 0;
                for (int b = i - 1; b <= i + 1; b++) {
                    for (int c = a - 1; c <= a + 1; c++) {
                        if (b > -1 && c > -1 && b < size && c < size ) {
                            sopl("grid [" + b + "]" + "[" + c + "] " + grid2[b][c]);
                            if (grid2[b][c] == 1 && !(b == i && c == a)) {
                                counter++;
                            }
                        }

                    }
                }
                sopl("counter " + counter);
                if (counter < 2) {
                    grid[i][a] = 0;
                }
                if (counter > 3) {
                    grid[i][a] = 0;
                }
                if (grid[i][a] == 0 && counter == 3) {
                    grid[i][a] = 1;
                }
            }
        }
        sopl("");
        for (int i = 0; i < grid2.length; i++) {
            for (int a = 0; a < grid2[i].length; a++) {
                sop(grid2[i][a]);
            }
            sopl("");
        }
        sopl("");
        for (int i = 0; i < grid.length; i++) {
            for (int a = 0; a < grid[i].length; a++) {
                sop(grid[i][a]);
            }
            sopl("");
        }

    }

}

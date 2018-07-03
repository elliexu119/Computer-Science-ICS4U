/*
 * Ellie X
 * Feb. 21, 2018 
 * simulates bacteria growth; 
 */
package unit2_arrays;

import java.util.Scanner;
import static resources.SOPL.sop;
import static resources.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //setup 
        Scanner input = new Scanner(System.in);
        int random1, random2, size = 20, randomCounter = 0;
        int[][] grid = new int[size][size];
        int[][] grid2 = new int[size][size];
        sopl("initial population? ");
        int num = input.nextInt();
        while (randomCounter < num) {
            random1 = (int) (Math.random() * size);
            random2 = (int) (Math.random() * size);
            if (grid[random1][random2] == 0) {
                grid[random1][random2] = 1;
                grid2[random1][random2] = 1;
                randomCounter++;
            }
        }

        //simulation 
        for (int i = 0; i < grid2.length; i++) {
            for (int a = 0; a < grid2[i].length; a++) {
                int neighbours = 0;
                for (int b = i - 1; b <= i + 1; b++) {
                    for (int c = a - 1; c <= a + 1; c++) {
                        if (b > -1 && c > -1 && b < size && c < size) {
                            sopl("grid [" + b + "]" + "[" + c + "] " + grid2[b][c]);
                            if (grid2[b][c] == 1 && !(b == i && c == a)) {
                                neighbours++;
                            }
                        }

                    }
                }
                sopl("grid [" + i + "]" + "[" + a + "]" + " has " + neighbours + " neighbours ");
                if (neighbours < 2) {
                    grid[i][a] = 0;
                }
                else if (neighbours > 3) {
                    grid[i][a] = 0;
                }
                else if (grid[i][a] == 0 && neighbours == 3) {
                    grid[i][a] = 1;
                }
            }
        }
        
        //output
        sopl("\norignal");
        sopl(grid2);
        sopl("\nafter 1 generation");
        sopl(grid);
    }

}

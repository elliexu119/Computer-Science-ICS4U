package resources;

import static resources.SOPL.sop;
import static resources.SOPL.sopl;

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
        int[][] grid = new int[20][20];
        int num = 10;
        for (int i = 0; i < num + 1; i++) {
            grid[(int) (Math.random() * 20)][(int) (Math.random() * 20)] = 1;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int a = 0; a < grid[i].length; a++) {
                sop(grid[i][a]);
            }
            sopl("");
        }
    }
}

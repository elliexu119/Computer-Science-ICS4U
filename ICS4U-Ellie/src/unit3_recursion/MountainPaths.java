/*
 * Mountain Paths - Greedy Algorithm
 * Mr. Muir
 * 2018.03.26 - v1.0
 */
package unit3_recursion;

import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import static resources.SOPL.sopl;

public class MountainPaths {

    static int count = 0;
    static int mx;

    /**
     * Mount Paths
     */
    public static void main(String[] args) throws Exception {

        // ***********************************
        // TASK 1:  read data into a 2D Array
        // 
        System.out.println("TASK 1: READ DATA");
        int[][] data = read(".\\data\\mountain.paths\\Colorado.844x480.dat"); //moutain paths test data.txt
//Colorado.844x480.dat
        mx = findMaxValue(data) + 1;

        // ***********************************
        // Construct DrawingPanel, and get its Graphics context
        //
        DrawingPanel panel = new DrawingPanel(data[0].length, data.length);
        Graphics g = panel.getGraphics();
//
//        // ***********************************
//        // TASK 2:  find HIGHEST & LOWEST elevation; for GRAY SCALE
//        //
        System.out.println("TASK 2: HIGHEST / LOWEST ELEVATION");
        int min = findMinValue(data);
        System.out.println("\tMin: " + min);
//
        int max = findMaxValue(data);
        System.out.println("\tMax: " + max);
//
//        // ***********************************
//        // TASK 3:  Draw The Map
//        //
        System.out.println("TASK 3: DRAW MAP");
        drawMap(g, data);
//
//        // ***********************************
//        // TASK 4A:  implement indexOfMinInCol
//        //
        System.out.println("TASK 4A: INDEX OF MIN IN COL 0");
        int minRow = indexOfMinInCol(data, 0);
        System.out.println("\tRow with lowest Col 0 Value: " + minRow);
//
//        // ***********************************
//        // TASK 4B:  use minRow as starting point to draw path
//        //
        System.out.println("TASK 4B: PATH from LOWEST STARTING ELEVATION");
        g.setColor(Color.RED);
        int totalChange = drawLowestElevPath(g, data, minRow, 0); //
        System.out.println("\tLowest-Elevation-Change Path starting at row " + minRow + " gives total change of: " + totalChange);
//
//        // ***********************************
        // TASK 5:  determine the BEST path

        g.setColor(Color.RED);
        int bestRow = indexOfLowestElevPath(g, data);
        sopl(bestRow);
//
//        // ***********************************
//        // TASK 6:  draw the best path
//        //
        System.out.println( "TASK 6: DRAW BEST PATH" );
        //drawMap.drawMap(g); //use this to get rid of all red lines
        g.setColor( Color.GREEN ); //set brush to green for drawing best path
        totalChange = drawLowestElevPath( g, data, bestRow, 0 );
        System.out.println( "\tThe Lowest-Elevation-Change Path starts at row: " + bestRow + " and gives a total change of: " + totalChange );

    }

    /**
     * This method reads a 2D data set from the specified file. The Graphics'
     * industry standard is width by height (width x height), while programmers
     * use rows x cols / (height x width).
     *
     * @param fileName the name of the file
     * @return a 2D array (rows x cols) of the data from the file read
     */
    public static int[][] read(String fileName) throws Exception {

        File file = new File(fileName);
        Scanner fileData = new Scanner(file);
        int row = 0, column = 0;
        for (; fileData.hasNext(); row++) {
            fileData.nextLine();
            if (row == 1) {
                StringTokenizer token = new StringTokenizer(fileData.nextLine());
                row++;
                for (column = 0; token.hasMoreTokens(); column++) {
                    token.nextToken();
                }
            }
        }
        int[][] data = new int[row][column];

        fileData = new Scanner(file);
        for (int i = 0; fileData.hasNext(); i++) {
            StringTokenizer token = new StringTokenizer(fileData.nextLine());
            for (int a = 0; token.hasMoreTokens(); a++) {
                String temp = token.nextToken().trim();
                data[i][a] = Integer.parseInt(temp);
                //sop(data[i][a] + " ");
            }
            //sopl("");
        }

        return data;
    }

    /**
     * @param grid a 2D array from which you want to find the smallest value
     * @return the smallest value in the given 2D array
     */
    public static int findMinValue(int[][] grid) {
        int min = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int a = 0; a < grid[i].length; a++) {
                if (grid[i][a] < min) {
                    min = grid[i][a];
                }
            }
        }
        return min;

    }

    /**
     * @param grid a 2D array from which you want to find the largest value
     * @return the largest value in the given 2D array
     */
    public static int findMaxValue(int[][] grid) {
        int max = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int a = 0; a < grid[i].length; a++) {
                if (grid[i][a] > max) {
                    max = grid[i][a];
                }
            }
        }
        return max;

    }

    /**
     * Given a 2D array of elevation data create a image of size rows x cols,
     * drawing a 1x1 rectangle for each value in the array whose color is set to
     * a a scaled gray value (0-255). Note: to scale the values in the array to
     * 0-255 you must find the min and max values in the original data first.
     *
     * @param g a Graphics context to use
     * @param grid a 2D array of the data
     */
    public static void drawMap(Graphics g, int[][] data) {
        int min = findMinValue(data);
        int max = findMaxValue(data);
        double temp;

        for (int i = 0; i < data.length; i++) {
            for (int a = 0; a < data[i].length; a++) {
                if (data[i][a] != min) {
                    temp = data[i][a] - min;
                    //sopl(temp / max * 255);
                    g.setColor(new Color((int) (temp / max * 255), (int) (temp / max * 255), (int) (temp / max * 255)));
                    //sopl((data[i][a]-min) + " " + max);
                } else {
                    g.setColor(new Color(0));
                }
                g.fillRect(a, i, 1, 1);
            }
        }

    }

    /**
     * Scan a single column of a 2D array and return the index of the row that
     * contains the smallest value
     *
     * @param grid a 2D array
     * @col the column in the 2D array to process
     * @return the index of smallest value from grid at the given col
     */
    public static int indexOfMinInCol(int[][] grid, int col) {
        // TODO
        int min = grid[0][col];
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] < min) {
                min = grid[i][col];
                ret = i;
            }
        }
        return ret;
    }

    /**
     * Find the minimum elevation-change route from West-to-East in the given
     * grid, from the given starting row, and draw it using the given graphics
     * context
     *
     * @param g - the graphics context to use
     * @param grid - the 2D array of elevation values
     * @param row - the starting row for traversing to find the min path
     * @return total elevation of the route
     */
    public static int drawLowestElevPath(Graphics g, int[][] data, int row, int col) {
        g.fillRect(col, row, 1, 1);

        if (col + 1 < data[0].length && row < data.length) {
            int dif2 = mx;
            int dif3 = mx;
            int dif1 = Math.abs(data[row][col + 1] - data[row][col]);
            if (row + 1 < data.length) {
                dif2 = Math.abs(data[row + 1][col + 1] - data[row][col]);
            }

            if (row - 1 >= 0) {
                dif3 = Math.abs(data[row - 1][col + 1] - data[row][col]);
            }

            if (dif1 < dif2 && dif1 < dif3) {
                count = count + dif1;
                drawLowestElevPath(g, data, row, col + 1);
            } else if (dif2 < dif3) {
                count = count + dif2;
                drawLowestElevPath(g, data, row + 1, col + 1);
            } else {
                count = count + dif3;
                drawLowestElevPath(g, data, row - 1, col + 1);
            }
        }
        return count;
    }

    /**
     * Generate all west-to-east paths, find the one with the lowest total
     * elevation change, and return the index of the row that path starts on.
     *
     * @param g - the graphics context to use
     * @param grid - the 2D array of elevation values
     * @return the index of the row where the lowest elevation-change path
     * starts.
     */
    public static int indexOfLowestElevPath(Graphics g, int[][] data) {
        int ans = 0; 
        int ansChange = drawLowestElevPath(g, data, 0, 0);
        count = 0;
        for (int i = 1; i < data.length - 1; i++) {
            if (ansChange > drawLowestElevPath(g, data, i, 0)){
                ans = i;
                count = 0;
                ansChange = drawLowestElevPath(g, data, i, 0);
                
            }
            count = 0;
        }
        return ans;
    }

}

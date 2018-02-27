/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.ArrayUtilEllie.toDouble;
import static resources.ArrayUtilEllie.toInt;

/**
 *
 * @author ellix
 */
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void bubbleSort(double number[], boolean way) {
        int x, y, cases = 1, unnessary = 0, swappedCount = 0, i = number.length;

        for (; cases < i; cases++, unnessary++) {// counting the cases
            for (x = 0, y = 1; y < i - unnessary; x++, y++) {//coutnting the letters in each case
                if (way == true) {//sorting order
                    if (number[x] > number[y]) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                } else if (number[x] < number[y]) {
                    swapBubble(number, x, y);
                    swappedCount += 1;
                }
            }
            if (swappedCount == 0) {
                cases = i;
            }
        }
    }

    public static void bubbleSort(int number[], boolean way) {
        double array[] = new double[number.length];
        toDouble(number, array);
        bubbleSort(array, way);
        toInt(array, number);
    }

    public static void bubbleSort(String number[], boolean way) {
        int x, y, cases = 1, unnessary = 0, swappedCount = 0, i = number.length;

        for (; cases < i; cases++, unnessary++) {// counting the cases
            for (x = 0, y = 1; y < i - unnessary; x++, y++) {//coutnting the letters in each case
                if (way == true) {//sorting order
                    if (number[x].compareToIgnoreCase(number[y]) > 0) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                } else if (number[x].compareToIgnoreCase(number[y]) < 0) {
                    swapBubble(number, x, y);
                    swappedCount += 1;
                }
            }
            if (swappedCount == 0) {
                cases = i;
            }
        }
    }

    public static void swapBubble(String[] number, int x, int y) {
        String sub = number[x];
        number[x] = number[y];
        number[y] = sub;
    }

    public static void swapBubble(double[] number, int x, int y) {
        double sub = number[x];
        number[x] = number[y];
        number[y] = sub;
    }

    public static void selectionSort(double number[], boolean way) { //sorting
        int x, unnessary = 0, cases = 1, i = number.length, max;
        for (; cases <= (i - 1); cases++) {//counting cases
            max = 0;
            for (x = 1; x < i - unnessary; x++) {//sorting the numbers in a case
                if (way == true) {//sorting order
                    if (number[x] > number[max]) {
                        max = x;
                    }
                } else if (number[x] < number[max]) {
                    max = x;
                }
            }
            double sub;
            sub = number[(i - unnessary) - 1];
            number[(i - unnessary) - 1] = number[max];
            number[max] = sub;
            unnessary++;
        }
    }

    public static void selectionSort(int number[], boolean way) {
        double number2[] = new double[number.length];
        toDouble(number, number2);
        selectionSort(number2, way);
        toInt(number2, number);
    }

    public static void selectionSort(String number[], boolean way) {
        int x, unnessary = 0, cases = 1, i = number.length, max;
        for (; cases <= (i - 1); cases++) {//counting cases
            max = 0;
            for (x = 1; x < i - unnessary; x++) {//sorting the numbers in a case
                if (way == true) {//sorting order
                    if (number[x].compareToIgnoreCase(number[max]) > 0) {
                        max = x;
                    }
                } else if (number[x].compareToIgnoreCase(number[max]) < 0) {
                    max = x;
                }
            }
            String sub;
            sub = number[(i - unnessary) - 1];
            number[(i - unnessary) - 1] = number[max];
            number[max] = sub;
            unnessary++;
        }
    }
}

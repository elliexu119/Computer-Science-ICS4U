/* Ellie Xu             
 * 4. 12. 2017.
 * methods: bubble sort, selection sort, max, average, min, shuffle, linear search, binary search. 
 * Version 1.0. 
 */
package resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtilEllie {

    public static void toString(double number[], String array[]) {
        for (int i = 0; i < number.length; i++) {
            array[i] = number[i] + "";
        }
    }

    public static void toString(int number[], String array[]) {
        for (int i = 0; i < number.length; i++) {
            array[i] = number[i] + "";
        }
    }

    public static void toDouble(String array[], double number[]) {
        for (int i = 0; i < number.length; i++) {
            number[i] = Double.parseDouble(array[i]);
        }
    }

    public static void toDouble(int number[], double array[]) {
        for (int i = 0; i < number.length; i++) {
            array[i] = number[i];
        }
    }

    public static void toInt(double array[], int number[]) {
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (array[i]);
        }
    }

    public static void toInt(String array[], int number[]) {
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(array[i]);
        }
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double average (double[] array){
       double average = 0; 
       for (int i = 0; i < array.length; i++){
           average = average + array [i];
       }
       average = average/array.length; 
        return average;
    }

    public static double average (int[] array){
       double average = 0; 
       for (int i = 0; i < array.length; i++){
           average = average + array [i];
       }
       average = average/array.length; 
        return average;
    }

    
    public static int linearSearch(double number[], double search) {
        String number2[] = new String[number.length], b = search + "";
        toString(number, number2);
        return linearSearch(number2, b, 0);
    }

    public static int linearSearch(int number[], int search) {
        String number2[] = new String[number.length], b = search + "";
        toString(number, number2);
        return linearSearch(number2, b, 0);
    }

    public static int linearSearch(String array[], String search, int pos) {
        if (!array[pos].equals(search)) {
            return linearSearch(array, search, pos + 1);
        } else {
            return pos;
        }
    }

    public static int binarySearch(double array[], double search, int pos) {
        if (search < array[pos] && pos > 0 ) {
            return binarySearch(array, search, (int) pos / 2);
        } else if (search > array[pos] && pos +1 < array.length) {
            if (pos == 1) {
                return binarySearch(array, search, 1 + pos);
            } else {
                return binarySearch(array, search, (int) (array.length-pos) / 2 + pos);
            }
        } else if (search == (array[pos])) {
            return pos;
        } else {
            return -1;
        }
    }

    public static int binarySearch(int number[], int search, int pos) {
        double number2[] = new double[number.length];
        toDouble(number, number2);
        return binarySearch(number2, (double) search, pos);
    }

    public static int binarySearch(String array[], String search, int pos) {
       if (search .compareTo(array[pos]) < 0 && pos > 0 ) {
            return binarySearch(array, search, (int) pos / 2);
        } else if (search .compareTo(array[pos]) > 0 && pos +1 < array.length) {
            if (pos == 1) {
                return binarySearch(array, search, 1 + pos);
            } else {
                return binarySearch(array, search, (int) (array.length-pos) / 2 + pos);
            }
        } else if (search.equals(array[pos])) {
            return pos;
        } else {
            return -1;
        }
    }

    public static void shuffleArray(String array[]) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.shuffle(list);
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    public static void shuffleArray(double a[]) {
        String array[] = new String[a.length];
        toString(a, array);
        shuffleArray(array);
        toDouble(array, a);
    }

    public static void shuffleArray(int a[]) {
        String array[] = new String[a.length];
        toString(a, array);
        shuffleArray(array);
        toInt(array, a);
    }

    public static String toUpperCase(String a) {
        a = a.toUpperCase();
        return a;
    }

    public static String toLowerCase(String a) {
        a = a.toLowerCase();
        return a;
    }

    public static double max(double[][] array) {
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {

                if (array[i][a] > max) {
                    max = array[i][a];
                }
            }
        }
        return max;
    }

    public static int max(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                if (array[i][a] > max) {
                    max = array[i][a];
                }
            }
        }
        return max;
    }

    public static double min(double[][] array) {
        double min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                if (array[i][a] < min) {
                    min = array[i][a];
                }
            }
        }
        return min;
    }

    public static int min(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                if (array[i][a] < min) {
                    min = array[i][a];
                }
            }
        }
        return min;
    }
    
    public static double average (double [] [] array){
        double sum = 0;
        int counter = 0; 
        for (int i = 0; i < array.length; i ++){
            for (int a  = 0; a < array.length; a++){
                sum = sum + array [i] [a]; 
                counter ++; 
            }
        }
        return sum/counter;
    }
    
        public static double average (int [][] array){
        double sum = 0;
        int counter = 0; 
        for (int i = 0; i < array.length; i ++){
            for (int a  = 0; a < array.length; a++){
                sum = sum + array [i] [a]; 
                counter ++; 
            }
        }
        return sum/counter;
    }

}

package resources;

import static resources.ArrayUtilEllie.average;
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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        double[] array = {1,2,4,5};

        sopl(average(array));
    }
}

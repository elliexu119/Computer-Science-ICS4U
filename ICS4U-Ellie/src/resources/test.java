/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static int a = 2;  
    public static void main(String[] args) {
    //sopl(b());
    //sout
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        test.a = a;
    }
    
    public int b(){
        int a = 4; 
        if (this.a == 2){
        return 2; 
    }
        else {
            return 4; 
        }
    }

}

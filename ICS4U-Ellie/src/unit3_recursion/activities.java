/*
 * Ellie 
 * March 2018 
 * recursion exercises 
 */
package unit3_recursion;

import static resources.SOPL.sopl;

/**
 *
 * @author ellix
 */
public class activities {
    public static int a = 0; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fiveTerms1(3); 
        a = 0; 
        sopl(" ---------------------- ");
        fiveTerms2(2); 
        a = 0; 
        sopl(" ---------------------- ");
        fiveTerms3(2); 
    }
    
    public static int fiveTerms1(int t){
        a ++; 
        System.out.println(t);
        if (a == 5){
            return t; 
        }
        return fiveTerms1(t+2); 
    }
    
    public static double fiveTerms2(double t ){
        a ++; 
        System.out.println(t);
        if (a == 5){
            return t; 
        }
        return fiveTerms2(1-1/t); 
    }
    
    public static double fiveTerms3(double t){
        a ++; 
        System.out.println(t);
        if (a == 5){
            return t; 
        }
        return fiveTerms3(a + t);
    }
    
    public static double fiveTerms4(double d, double t){
        a ++; 
        System.out.println(t);
        if (a == 5){
            return t; 
        }
        return fiveTerms4(d + t, d);
    }
}

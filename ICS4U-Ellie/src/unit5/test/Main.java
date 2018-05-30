/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5.test;

/**
 *
 * @author ellix
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fraction a = new Fraction (2, 1);
        assert(a.size() == 2);
       
        MixedFraction b = new MixedFraction (2, 2, 1);
        assert(b.getNumerator() == 4);
        
        //larger and equals
        assert (b.larger(a).equals(b));
        assert (b.larger(b, a ) .equals(b));
        
        //reducing 
        Fraction d = new Fraction (5, 10); 
        assert (d.getNumerator() == 1);
        
        //times 
        Fraction c = new Fraction (8, 1);
        assert(a.times(b).equals(c));
        assert (a.times(a, b). equals(c));
        
        //invert 
        a.invert();
        assert(a .equals( new Fraction(1,2)));
        a = new Fraction (-2, 1);
        a.invert(); 
        assert(a.getDenominator() > 0);
        
    }
    
}

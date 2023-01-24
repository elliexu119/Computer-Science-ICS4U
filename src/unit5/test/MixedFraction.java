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
public class MixedFraction extends Fraction{

    public MixedFraction(int whole, int num, int den) {
        this.whole = whole; 
        this.num = num;
        this.den = den;
        this.num = num + whole * den; 
        reduce(); 
    }
    
    
}

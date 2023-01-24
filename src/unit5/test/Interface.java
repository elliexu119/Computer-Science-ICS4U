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
public interface Interface {
    public double size(); 
    
    public Fraction larger (Fraction f);
    
    public Fraction larger (Fraction f, Fraction g);
    
    public Fraction times (Fraction f);
    
    public Fraction times (Fraction f, Fraction g);
    
    public void reduce(); 
    
    public String toString(); 
    
    public boolean equals (Fraction f); 
    
    public void invert(); 
    
    public int gcd (int p, int q);
    
}

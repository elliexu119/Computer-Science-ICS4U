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
public class Fraction implements Interface {

    protected int whole, num, den;

    public Fraction() {

    }

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        reduce(); 
    }
    

    @Override
    public double size() {
        return num / den;
    }

    public int getNumerator() {
        return num;
    }

    public int getDenominator() {
        return den;
    }

    public Fraction larger(Fraction f) {
        if (this.num / this.den > f.num / f.den || (this.num / this.den == f.num / f.den)) {
            return this;
        } else {
            return f;
        }
    }

    public Fraction larger(Fraction f, Fraction g) {
        if (f.num / f.den > g.num / g.den || (f.num / f.den == g.num / g.den)) {
            return f;
        } else {
            return g;
        }
    }

    public Fraction times(Fraction f) {
        return new Fraction(this.num * f.num, this.den * f.den);
    }

    public Fraction times(Fraction f, Fraction g) {
        return new Fraction(f.num * g.num, f.den * g.den);
    }

    public void reduce() {
        int gcd = gcd(num, den);
        if (gcd > 1) {
            num = num / gcd;
            den = den / gcd;
            reduce();
        }
    }

    public boolean equals(Fraction f) {
        if (this.num / this.den == f.num / f.den) {
            return true;
        } else {
            return false;
        }
    }

    public void invert() {
        int temp = den;
        den = num;
        num = temp;
        if (den < 0){
            num = num *-1; 
            den = den * -1; 
        }
    }

    public String toString() {
        if (den == 1){
            return this.num + "";
        }
        else 
        return this.num + "/" + this.den;
    }

    public int gcd(int p, int q) {
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }

}

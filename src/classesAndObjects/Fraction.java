package classesAndObjects;

public class Fraction{

	private int numerator;
	private int denominator;	
	
	
	
//	public int getNumerator() {
//		return numerator;
//	}
//	
//	public void setNumerator(int numerator) {
//		this.numerator = numerator;
//	}
//	
//
//	public int getDenominator() {
//		return denominator;
//	}
//	
//	public void setDenominator(int denominator) {
//		this.denominator = denominator;
//	}

	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		
		simplify();                                    // call simplify function
	}
	
	private void simplify() {
		int gcd = 1;                                  // greater common divider
		
		int smaller = Math.min(numerator, denominator);
		
		for(int i=2 ; i<=smaller; i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}
		}
		
		numerator/=gcd;
		denominator/=gcd;
	}
	
	public void increment() {                            // increment function
		numerator = numerator + denominator;
		simplify();                                     // call simplify
	}
	
	public void add(Fraction f2) {
		// First Fraction is the fraction on which function is called
		///Second Fraction is passed as arguments
		
		this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
		
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNum = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
		int newDeno = f1.denominator * f2.denominator;
		
		Fraction f3 = new Fraction(newNum, newDeno);
		return f3;
	}
	
	
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}

}




 
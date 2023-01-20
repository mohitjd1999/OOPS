package classesAndObjects;
import java.util.Scanner;

public class FractionUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerator = sc.nextInt();
	    int denominator = sc.nextInt();
		
        Fraction f1 = new Fraction(numerator, denominator);
        
//       f1.increment();
//        f1.print();
        
        Fraction f2 = new Fraction (3, 2);
        
//         f2.print();
//         
//         f1.add(f2);
//         f1.print();
        
        Fraction f3 = Fraction.add(f1, f2);
        f3.print();
        
	}

}


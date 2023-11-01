package studio7;

public class Fraction {
	
	private int denominator;
	private int numerator;
	
	public Fraction(int n, int d) {
		this.denominator = d;
		this.numerator = n;
	}
	
	public static Fraction addFraction(Fraction f1, Fraction f2) {
		int newDenominator = f1.denominator * f2.denominator;
		int n1 = f1.numerator * f2.denominator;
		int n2 = f2.numerator * f1.denominator;
		Fraction result = new Fraction((n1 + n2), newDenominator);
		return result;
	}
	
	public static Fraction multiplyFraction(Fraction f1, Fraction f2) {
		int newNumerator = f1.numerator * f2.numerator;
		int newDenominator = f2.denominator *  f1.denominator;
		Fraction result = new Fraction(newNumerator, newDenominator);
		return result;
	}
	
	public Fraction recprocal(Fraction f) {
		Fraction result = new Fraction(f.denominator, f.numerator);
		return result;
	}
	
	public Fraction simplify(Fraction f) {
		int gcd = gcd(f.numerator, f.denominator);
		int newNumerator = f.numerator / gcd;
		int newDenominator = f.denominator / gcd;
		Fraction result = new Fraction(newNumerator, newDenominator);
		return result;
	}
	
	public int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		} else {
			return gcd(q, (p%q));
		}
		
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(7,9);
		Fraction f2 = new Fraction(9,14);
		Fraction answer = addFraction(f1, f2);
		
	}

}

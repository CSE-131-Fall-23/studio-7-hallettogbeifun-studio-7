package studio7;

public class Complex {
	
	private int realPart;
	private int complexPart;
	
	public Complex(int r, int c) {
		this.realPart = r;
		this.complexPart = c;
	}
	
	public Complex addComplex(Complex c1, Complex c2) {
		int newRealPart = c1.realPart + c2.realPart;
		int newComplexPart = c1.complexPart + c2.complexPart;
		Complex result = new Complex(newRealPart, newComplexPart);
		return result;
	}
	
	public Complex multiplyComplex(Complex c1, Complex c2) {
		int newRealPart = (((c1.realPart) * (c2.realPart)) - ((c1.complexPart) * (c2.complexPart)));
		int newComplexPart = (((c1.realPart) * (c2.complexPart)) + ((c1.complexPart) * (c2.realPart)));
		Complex result = new Complex(newRealPart, newComplexPart);
		return result;
	}
	
}

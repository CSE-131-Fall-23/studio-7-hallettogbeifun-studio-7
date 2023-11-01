package studio7;

public class Die {
	
	private int sides;
	
	public Die(int s) {
		this.sides = s;
	}
	
	public int throwDie() {
		int randomNumber = (int)(Math.random() * sides) + 1;
		return randomNumber;
	}
	
	public static void main(String[] args) {
		Die testDie = new Die(6);
		System.out.println(testDie.throwDie());
		System.out.println(testDie.throwDie());
		System.out.println(testDie.throwDie());
		System.out.println(testDie.throwDie());
		
		
	}

}

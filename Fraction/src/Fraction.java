
public class Fraction implements Comparable<Fraction> {
	private int num, den;

	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public static Fraction mult(Fraction num1, Fraction num2) {
		int num = (num1.num * num2.num);
		int den = (num1.den * num2.den);
		return new Fraction(num, den);
	}

	public void mult(Fraction other) {
		this.num *= other.num;
		this.den *= other.den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public String toString() {
		return (num + "/" + den);
	}

	@Override
	public int compareTo(Fraction other) {
		double num1 = this.toDouble();
		double num2 = other.toDouble();
		if ((num1 - num2) > 0) {
			return 1;
		}
		if ((num1 - num2) < 0) {
			return -1;
		}
		return 0;
	}

	public double toDouble() {
		return (this.num / (double) this.den);
	}

	public void reduce() {
		for (int i = 2; i < this.den; i++) {
			if (this.num % i == 0 && this.den % i == 0) {
				this.num /= i;
				this.den /= i;
				i = 1;
			}
		}
	}

	public static subtract(Fraction other) {
		for (int i )
	}

	public Fraction subtract(Fraction num1, Fraction num2) {

	}

	public static add(Fraction other) {
		
	}

	public Fraction add(Fraction num1, Fraction num2) {

	}

	public static divide(Fraction other) {
		
	}

	public Fraction divide(Fraction num1, Fraction num2) {

	}

	// BOTH static and non-static: subtract, add, divide
	// reduce
}

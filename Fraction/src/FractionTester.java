import java.util.ArrayList;
import java.util.Collections;

public class FractionTester {

	public static void main(String[] args) {
		ArrayList<Fraction> fractions = new ArrayList<Fraction>();
		Fraction num1 = new Fraction(1, 3);
		Fraction num2 = new Fraction(1, 4);
		Fraction num3 = new Fraction(12, 16);
		fractions.add(num1);
		fractions.add(num2);
		fractions.add(num3);

		System.out.println(num1.toString() + "\n" + num2.toString());
		Fraction result = Fraction.mult(num1, num2);
		fractions.add(result);
		System.out.println(result.toString());
		Collections.sort(fractions);
		System.out.println(fractions);
		num3 = fractions.get(3);
		num3.reduce();
		fractions.set(3, num3);
		System.out.println(fractions);
	}

}

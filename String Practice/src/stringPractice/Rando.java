package stringPractice;

public class Rando {

	public static void main(String[] args) {
		String text = "Once upon a time there was a small pigdog. ";
		text = text + "Milo was the cutest pigdog to ever swim the English Channel.";

		System.out.println(text.indexOf("pigdog", 36));

	}

}

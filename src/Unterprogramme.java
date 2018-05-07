
public class Unterprogramme {
	public static void main(String[] args) {

		String text = "Heute ist einer schöner Tag";
		char[] z = text.toCharArray();
		countChar(z, 'e');
		countChar(z, 'i');
		countChar(z, 'ä');
		System.out.println("--------------------------");
		System.out.println(countChar2(z, 'e'));
		System.out.println(countChar2(z, 'i'));
		System.out.println(countChar2(z, 'ä'));

	}

	public static void countChar(char[] ch, char c) {
		int counter = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				counter++;
			}
		}
		System.out.println("Anzahl der " + c + "'s im Text: " + counter);
	}



	public static int countChar2(char[] ch, char c) {
		int counter = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				counter++;
			}
		}
		
		return counter;
	}
}

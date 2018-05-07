import javax.swing.JOptionPane;

public class WoerterRaten {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Please enter a word.");
		char[] word = input.toCharArray();
		System.out.println("The searched word has " + word.length + " letters."
				+ " Begin guessing!");
		
		Hangman(word, 'e');
	}
	public static String Hangman(char[] word, char searchLetter) {
		for(int i = 0; i < word.length; i++) {
			if(word[i] == searchLetter) {
				System.out.println("There is a/an "+ searchLetter+" on the " + word[i]+1 + " place of the word.");
			}
		}
		
		
		
		
		return "";
	}
}

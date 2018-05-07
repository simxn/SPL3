
import javax.swing.JOptionPane;

public class Schaltjahr {
	public static void main(String[] args) {
		
		String message = "Bitte geben Sie ein Jahr ein!";
		String input = JOptionPane.showInputDialog(message);
		
		Schaltjahr(input);
		
	}
	public static String Schaltjahr(String input) {
		
		int inputInt = Integer.parseInt(input);
		
		if (inputInt % 4 == 0 && inputInt % 400 == 0) {
			System.out.println("Das Jahr " + inputInt + " ist ein Schaltjahr.");
		} else if (inputInt%4 == 0 && inputInt % 100 != 0) {
			System.out.println("Das Jahr " + inputInt + " ist ein Schaltjahr.");
		} else {
			System.out.println("Das Jahr "+input+" ist kein Schaltjahr!");
		}
		
		return "";
	}
}


public class TemperaturMittelwert {
	public static void main(String[] args) {

		int unter10grad = 0;
		int zwischen10und20 = 0;

		int[] temp = new int[1000];
		// 0-40°C
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 41);
		}
		// # Temperaturwerte < 10°

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] <= 10) {
				unter10grad++;
			} else if (temp[i] >= 10 && temp[i] <= 20) {
				zwischen10und20++;
			}
		}
		System.out.println("Es wurden " + unter10grad + " Temperaturen unter 10° gemessen.");
		System.out.println("Es wurden " + zwischen10und20 + " Temperaturen zwischen 10°-20° gemessen.");
	}
}


public class TemperaturMittelwert {
	public static void main(String[] args) {

		int[] temp = new int[1000];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 41);
		}

		String temperatures = getTemperature(temp);
		System.out.println(temperatures);
	}

	public static String getTemperature(int[] temperatures) {
		int unter10grad = 0;
		int zwischen10und20 = 0;
		int zwischen20und30 = 0;
		int ueber30 = 0;

		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] <= 10) {
				unter10grad++;
			} else if (temperatures[i] >= 10 && temperatures[i] <= 20) {
				zwischen10und20++;
			} else if (temperatures[i] > 20 && temperatures[i] <= 30) {
				zwischen20und30++;
			} else if (temperatures[i] > 30) {
				ueber30++;
			}
		}

		String msg = "Im Messbereich von " + temperatures.length + " wurden " + unter10grad + " Temperaturen unter 10°"
				+ ", \n " + zwischen10und20 + " Temperaturen zwischen 10°-20°, \n " + zwischen20und30 + " Temperaturen"
				+ "zwischen 20°-30° \n und " + ueber30 + " Temperaturen über 30° gemessen.";

		return msg;
	}

}

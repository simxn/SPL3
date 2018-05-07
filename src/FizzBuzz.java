
public class FizzBuzz {
	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			FizzBuzz(i);
		}
		System.out.println("------");
		for(int i = 1; i<=100; i++) {
			FizzerBuzzer(i);
		}
		System.out.println();
		System.out.println("Ende...");
	}
	public static void FizzBuzz(int i) {
		if(i%3 == 0 && i%5 == 0) {
			System.out.print("FizzBuzz!");
		} else if(i%3 == 0) {
			System.out.print("Fizz!");
		} else if(i%5 == 0) {
			System.out.print("Buzz!");
		} else {
			System.out.print(i);
		}
		System.out.println();
	}
	public static void FizzerBuzzer(int i) {
		if(i%4 == 0 && i%7 == 0) {
			System.out.print("FizzerBuzzer!");
		} else if(i%4 == 0) {
			System.out.print("Fizzer!");
		} else if(i%7 == 0) {
			System.out.print("Buzzer!");
		} else {
			System.out.print(i);
		}
		System.out.println();
	}
}


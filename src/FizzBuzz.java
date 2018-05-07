
public class FizzBuzz {
	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			FizzBuzz(i);
		}
		System.out.println("------");
		for(int i = 0; i<=100; i+=4) {
			FizzerBuzzer(i, false);
		}
		
		System.out.println();
		System.out.println("Ende...");
	}
	public static void FizzBuzz(int i) {
		if(i%3 == 0 && i%5 == 0) {
			System.out.print("("+ i +") FizzBuzz!");
		} else if(i%3 == 0) {
			System.out.print("("+ i +") Fizz!");
		} else if(i%5 == 0) {
			System.out.print("("+ i +") Buzz!");
		} else {
			System.out.print("("+i+")");
		}
		System.out.println();
	}
	public static void FizzerBuzzer(int i, boolean showFizzBuzz) {
		if(i%4 == 0 && i%7 == 0 && showFizzBuzz == true) {
			System.out.print("("+ i +") FizzerBuzzer!");
		} else if(i%4 == 0) {
			System.out.print("("+ i +") Fizzer!");
		} else if(i%7 == 0) {
			System.out.print("("+ i +") Buzzer!");
		} else {
			System.out.print(i);
		}
		System.out.println();
	}
}


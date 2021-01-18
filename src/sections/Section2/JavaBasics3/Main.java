/*
 * The following code is provided "as-is" without any expresses warranties or guarentees
 * of any kind. It is strictly for educational purposes only and it may not be redistributed
 * without the express permission of the author (Stephen King).
 */
package src.sections.Section2.JavaBasics3;

public class Main {

	/**
	 * The following code is more or less written as Stephen showed it in the video.
	 * Some parts that were too similar to each other were ommited.
	 */
	public static void main(String[] args) {
		System.out.println(getMessage());

		String raw = "hello152";
		try {
			int test = Integer.parseInt(raw);
			System.out.println("Success!");
		} catch (NumberFormatException e) {
			System.out.println("Oh no! Struggle!!!");
		}
	}

	public static int number = 0;

	public static String getMessage() {
		String message = "Banana";
		//
		//
		// lots of complicated code to mess with the original string
		//

		return message;
	}

	public static void sendMessage() {
		System.out.println("Hello!");
	}

	public void sayHello() {
		SecondClass second = new SecondClass();
		SecondClass second2 = new SecondClass();
		SecondClass second3 = new SecondClass();
	}

}

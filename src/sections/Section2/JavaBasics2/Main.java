/*
 * The following code is provided "as-is" without any expresses warranties or guarentees
 * of any kind. It is strictly for educational purposes only and it may not be redistributed
 * without the express permission of the author (Stephen King).
 */
package src.sections.Section2.JavaBasics2;

public class Main {

	/**
	 * The following code is more or less written as Stephen showed it in the video.
	 * Some parts that were too similar to each other were ommited.
	 */
	public static void main(String[] args) {
		sendMessage("The code is now running!", 25);

		String myString = null;
		System.out.println(myString.substring(3));

		SecondClass second = new SecondClass();
		second.sayHello();
	}

	public static void sendMessage(String message, int number) {
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
	}
}

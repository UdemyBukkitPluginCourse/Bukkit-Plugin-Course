/*
 * The following code is provided "as-is" without any expresses warranties or guarentees
 * of any kind. It is strictly for educational purposes only and it may not be redistributed
 * without the express permission of the author (Stephen King).
 */
package src.sections.Section2.JavaBasics1;

public class Main {

	/**
	 * The following code is more or less written as Stephen showed it in the video.
	 * Some parts that were too similar to each other were ommited.
	 */
	public static void main(String[] args) {

		String test1 = "Hello, my name is Stephen!";
		int test2 = 100;
		double test3 = 10.5;
		char test4 = 'M';
		boolean test5 = false;

		test2 = test2 + 5;

		System.out.println(test2);

		if (test5 == true) {
			System.out.println("Success!");
		} else {
			System.out.println("Failed!");
		}

		// Hello

		/* >
		 * <
		 * >=
		 * <=
		 * ==
		 * !=
		 * &&
		 * ||
		 */

		int number = 5;

		if(number >= 10) {
			System.out.println("Success!");
		}

		if(number > 5 && number < 10) {
			System.out.println("Success!");
		}
	}
}

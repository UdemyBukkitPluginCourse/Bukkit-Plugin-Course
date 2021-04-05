/*
 * Copyright (c) 2021. This code is the property of Stephen King of the Udemy Bukkit Plugin Course.
 * Unauthorized redistribution of this code outside of an educational context is prohibted.  The following code
 * is provided "as-is" without any expresses warranties or guarentees of any kind.
 *
 * Use and viewing of this code is only granted to paying members of the Udemy Bukkit Plugin Course
 * Link -> https://www.udemy.com/course/develop-minecraft-plugins-java-programming/
 * Discord -> https://discord.gg/hZSzvzY
 */

package src.sections.Section2.JavaBasics1;

public class Main {

	/** Writer's note
	 * Stephen frequently deletes and overrites code in the lectures explaining certain topics,
	 * code may differ but is still functional as it is explained in the lecture.
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

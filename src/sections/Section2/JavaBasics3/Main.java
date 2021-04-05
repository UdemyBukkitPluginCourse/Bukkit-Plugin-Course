/*
 * Copyright (c) 2021. This code is the property of Stephen King of the Udemy Bukkit Plugin Course.
 * Unauthorized redistribution of this code outside of an educational context is prohibted.  The following code
 * is provided "as-is" without any expresses warranties or guarentees of any kind.
 *
 * Use and viewing of this code is only granted to paying members of the Udemy Bukkit Plugin Course
 * Link -> https://www.udemy.com/course/develop-minecraft-plugins-java-programming/
 * Discord -> https://discord.gg/hZSzvzY
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

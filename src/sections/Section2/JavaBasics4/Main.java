/*
 * Copyright (c) 2021. This code is the property of Stephen King of the Udemy Bukkit Plugin Course.
 * Unauthorized redistribution of this code outside of an educational context is prohibted.  The following code
 * is provided "as-is" without any expresses warranties or guarentees of any kind.
 *
 * Use and viewing of this code is only granted to paying members of the Udemy Bukkit Plugin Course
 * Link -> https://www.udemy.com/course/develop-minecraft-plugins-java-programming/
 * Discord -> https://discord.gg/hZSzvzY
 */

package src.sections.Section2.JavaBasics4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Part 1
		int number = 5;

		switch (number) {
			case 1:

				break;
			case 5:

				break;
			case 10:

				break;
			case 8006:

				break;
			default:

				break;
		}

		if(number == 5) {

		} else if (number == 10){

		} else if (number == 8006) {

		} else {

		}

		// Part 2
		List<Double> list = new ArrayList<>();
		list.add(0.8);
		list.add(4.1);
		list.add(106.5);

		System.out.println(list.get(2));

		// ------------------------------------------------------

		HashMap<Double, String> hashMap = new HashMap<>();
		hashMap.put(19.1, "NINTEEN . 1");
		hashMap.put(981247.1, "84271987MADWMOIUDMWNM");

		System.out.println(hashMap.get(19.1));

		LinkedList<String> linkedList = new LinkedList<>();

		LinkedHashMap<Double, String> linkedHashMap = new LinkedHashMap<>();

		// Part 3

		List<String> list1 = new ArrayList<>(); // Name changed
		list1.add("test1");
		list1.add("test2");

		HashMap<String, Integer> hashmap = new HashMap<>();

		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for(String str : list1) {
			System.out.println(str);
		}

		for(Integer number1 : hashmap.values()) { // number1 = number
			System.out.println(number1);
		}

		// Part 4

		int number1 = 100; // Named changed from number -> number1
		while(number < 200) {
			number = number + 5;
		}
	}
}

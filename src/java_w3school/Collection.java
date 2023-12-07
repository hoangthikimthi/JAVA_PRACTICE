package java_w3school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		BT_10_shuffle_elements();
	}

	public static void BT_10_shuffle_elements() {
		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1: " + List1);

		Collections.shuffle(List1);
		;
		System.out.println("List1: " + List1);
	}

	public static void BT_09_sort_a_given_array_list() {
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1: " + List1);
		List<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		System.out.println("List2: " + List2);
		Collections.copy(List1, List2);
		System.out.println("List1: " + List1);
		System.out.println("List2: " + List2);
	}

	public static void BT_08_sort_a_given_array_list() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
		Collections.sort(list_Strings);
		System.out.println(list_Strings);
	}

	public static void BT_07_searchElement() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");

		if (list_Strings.contains("Geen")) {
			System.out.println("tim thay");
		} else {
			System.out.println("k tim thay");
		}
	}

	public static void BT_06_removeElement() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");

		System.out.println(list_Strings);

		list_Strings.remove("Red");
		list_Strings.removeAll(list_Strings);
		System.out.println(list_Strings);
	}

	public static void BT_05_setElement() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");

		System.out.println(list_Strings);

		list_Strings.set(4, "Yellow");

		System.out.println(list_Strings);
	}

	public static void BT_04_getFromSpecialIndex() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		System.out.println(list_Strings.get(0));
		// Now insert a color at the first and last position of the list
		list_Strings.add(0, "Pink");
		list_Strings.add(5, "Yellow");
		// Print the list
		System.out.println(list_Strings.get(5));
	}

	public static void BT_03_Add_Possition() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		System.out.println(list_Strings);
		// Now insert a color at the first and last position of the list
		list_Strings.add(1, "Pink");
		list_Strings.add(4, "Yellow");
		// Print the list
		System.out.println(list_Strings);
	}

	public static void BT_02_Interate() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("hoa");
		arrayList.add("thi");
		arrayList.add("linh");
		for (String i : arrayList) {
			System.out.println(i);
		}
	}

	public static void BT_01_Create_Add() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("hoa");
		arrayList.add("thi");
		arrayList.add("linh");
		System.out.println(arrayList);
	}

}

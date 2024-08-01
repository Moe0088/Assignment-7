package com.coderscampus;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();
		
		myCustomList.add("1");
		myCustomList.add("2");
		myCustomList.add("3");
		myCustomList.add("4");
		myCustomList.add("5");
		myCustomList.add("6");
		myCustomList.add("7");
		myCustomList.add("8");
		myCustomList.add("9");
		myCustomList.add("10");
		myCustomList.add("11");
		myCustomList.add("12");
		myCustomList.add("13");
		myCustomList.add("14");
		myCustomList.add("15");
		myCustomList.add("16");
		myCustomList.add("17");
		myCustomList.add("18");
		myCustomList.add("19");
		myCustomList.add("20");
		myCustomList.add("30");
		myCustomList.add("31");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		System.out.println("Total size of the array:  " + myCustomList.getSize());

	}
}

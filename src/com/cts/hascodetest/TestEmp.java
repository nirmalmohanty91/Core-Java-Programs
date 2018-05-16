package com.cts.hascodetest;

import java.io.IOException;

public class TestEmp {

	public static void main(String[] args) throws IOException {
		String str = "I Am Not String";
		char[] stringArray = str.toCharArray();
		System.out.println(String.valueOf(stringArray));
		// System.out.println(str.length());
		StringBuffer sb = new StringBuffer(str.replaceAll("\\s", ""));
		char[] string1 = sb.reverse().toString().toCharArray();
		System.out.println(String.valueOf(string1));
		// char[] resultArray = new char[stringArray.length];

		char[] resultArray = stringArray.clone();
		System.out.println(resultArray.length);
		int j = 0;
		for (int i = 0; i < resultArray.length; i++) {

			if (resultArray[i] == ' ') {

			} else {
				resultArray[i] = string1[j];
				j++;

			}
		}
		System.out.println(String.valueOf(resultArray));
	}
}

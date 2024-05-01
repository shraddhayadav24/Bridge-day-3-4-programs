package com.bridgeday1.pb;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String reversedstring=" ";
	System.out.println("enter the string");
	String str= sc.nextLine();
	for(int i=0;i<str.length();i++) {
		reversedstring = str.charAt(i) + reversedstring;
	}
	System.out.println("Reverse String is:  " + reversedstring);
	
}
}

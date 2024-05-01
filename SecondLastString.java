package com.bridgeday1.pb;

public class SecondLastString {
public static void main(String[] args) {
	String str= "java is a programming language";
	String [] str2 = str.split("  ");
	if(str2.length >= 2) {
		String secondlast = str2[str2.length-2];
		System.out.println(secondlast);
	}
}
}

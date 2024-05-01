package com.bridgeday1.pb;

public class StringAtEvenLocationArray {
public static void main(String[] args) {
	String[] str= {"shraddha", "rahul", "rohit", " jessica"};
	for(int i=0; i<str.length; i=i+2) {
		System.out.println(str[i]);
	}
}
}

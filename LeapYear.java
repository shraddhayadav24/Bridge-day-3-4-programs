package com.bridgeday1.pb;

public class LeapYear {
public static void main(String[] args) {
	int year=200;
	if(year>=1000 && year<=9999) {
	if(year % 400 == 0 || year %4==0 && year %100 != 0) {
		System.out.println("leap year");
	}else {
		System.out.println("Not leap year");
	}
}else {
	System.out.println("enter the valid year");
}
}
}
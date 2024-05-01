package com.bridgeday1.pb;

import java.util.Scanner;

public class ArrayEvenOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Number");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements in array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println("even no are: " +a[i]);
		}
		else {
			System.out.println("odd no are: " +a[i]);
		}
	}
	
	
}
}

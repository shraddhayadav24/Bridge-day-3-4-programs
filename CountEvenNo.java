package com.bridgeday1.pb;

import java.util.Scanner;

public class CountEvenNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int a[]=new int[n];
	int ecount=0;
	System.out.println("enter the elements in array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			ecount++;
		}
	}
	System.out.println("even count in array is: "+ ecount);
}
}
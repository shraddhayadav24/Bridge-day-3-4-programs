package com.bridgeday1.pb;

import java.util.Scanner;

public class AvgOfEvenNo {
public static void main(String[] args) {
	int count=0;
	double sum = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int  a[]=new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i=i+2) {
		
	   sum=sum+a[i];
		count++;
	}
	if(count>0) {
		double average= sum/count;
		System.out.println(average);
	}
	
}
}

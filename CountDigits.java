package com.bridgeday1.pb;

public class CountDigits {
public static void main(String[] args) {
	int n=5437;
	int sum = 0;
	while(n>0) {
		n=n/10;
		sum=sum+1;
	}
	System.out.println(sum);
}
}

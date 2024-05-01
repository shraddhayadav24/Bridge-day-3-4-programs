package com.bridgeday1.pb;

public class Palindrome {
public static void main(String[] args) {
	int n=111, rev=0, temp=n;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);
	if(temp==rev) {
		System.out.println("palindrome");
	}else {
		System.out.println("Not palindrome");
	}
}
}

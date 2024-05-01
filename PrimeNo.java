package com.bridgeday1.pb;

public class PrimeNo {
public static void main(String[] args) {
	int no=28;
	boolean flag=false;
	for(int i=2;i<no/2;i++) {
		if(no%i==0) {
			flag=true;
			break;
		}
	}
	if(!flag) {
		System.out.println("prime no");
	}else {
		System.out.println("not");
	}
}
}

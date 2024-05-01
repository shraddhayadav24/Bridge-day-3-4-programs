package com.bridgeday1.pb;

public class Armstrong {
public static void main(String[] args) {
	int n=153;
	int count=0; int temp=n; int sum=0;
	while(temp>0) {
		temp=temp/10;
		count++;
	}
	temp=n;
	while(temp>0) {
		int ld=temp%10;
	int	prod=1;
	for(int i=1;i<=count;i++) {
		prod=prod*ld;
	}
	sum=sum+prod;
	temp=temp/10;
	}
	if(sum==n) {
		System.out.println("Armstrong no");
	}else {
		System.out.println("Not Armstrong no");
	}
}
}

package com.bridgeday1.pb;

public class Fibocanni {
public static void main(String[] args) {
	int n=10, fibb1=0, fibb2=1;
	
	for(int i=2;i<n;i++) {
	int	sum=fibb1+fibb2;
	System.out.println(sum);
	
	fibb1=fibb2;
	fibb2=sum;
	
	}
}
}

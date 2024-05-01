package com.bridgeday1.pb;

public class LargestAndSmallest {
public static void main(String[] args) {
	int arr[]= {13,67,45,23,90,50,8};
	int small=arr[0];
	int large=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(small>arr[i]) {
			small=arr[i];
		}
		if(large<arr[i]) {
			large=arr[i];
		}
	}
	System.out.println(small);
	System.out.println(large);
}
}

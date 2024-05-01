package com.bridgeday1.pb;

public class SecondLargestArray {
public static void main(String[] args) {
	int arr[]= {12,43,76,83,24};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("the second largest array is: " + arr[arr.length-2]);
}
}

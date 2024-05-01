package com.bridgeday1.pb;

public class DuplicateArray {
public static void main(String[] args) {
	int arr[]={10,20,10,3,4,7,4,20};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}
}
}

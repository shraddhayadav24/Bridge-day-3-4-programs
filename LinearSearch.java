package com.bridgeday1.pb;

public class LinearSearch {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60};
	int search_element=50;
	boolean flag=false;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==search_element) {
			System.out.println("element found at: " + i + " index");
			flag=true;
			break;
		}
	}
	if(flag=false) {
		System.out.println("element not found");
	}
}
}

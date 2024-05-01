package com.bridgeday1.pb;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,69};
	int target=50;
	int length=arr.length-1;
	int low=0;
	int result = -1;
	while(low <= length) {
		int mid = low + (length-low)/2;
		if(arr[mid]== target) {
			result = mid;
			break;
		}else if(arr[mid]<target){
			low=mid+1;
		}else {
			length=mid-1;
		}
	}
	if(result != -1) {
		System.out.println("element found at index: " + result);
	}else {
		System.out.println("element not found");
	}
	
}
}

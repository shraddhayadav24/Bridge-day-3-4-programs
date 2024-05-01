package com.bridgeday1.pb;

public class FrequencyOfArray {
public static void main(String[] args) {
	int arr[]= {1, 2, 8, 3, 2, 2, 2, 5, 1};
	int a[]=new int[arr.length];
	
	  int visited = -1; 
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				arr[j]=visited;
			}
		}
		if(a[i]!= visited) {
			a[i]=count;
		}
	
		if(a[i]!= visited) {
			System.out.println(  "has count" + a[i] +"times" );
		}
	}
	}
}



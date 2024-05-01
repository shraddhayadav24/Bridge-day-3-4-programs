package com.bridgeday1.pb;

public class SortArray {
public static void main(String[] args) {
	int a[]= {34,90,22,45,87};
	
	//BUBBLE SORT
//	for(int i=0;i<a.length-1;i++) {
//		for(int j=0;j<(a.length-1)-i;j++) {
//			if(a[j]>a[j+1]) {
//				int temp = a[j];
//				a[j] = a[j+1];
//				a[j+1] = temp;
//			}
//		}
//	}
//	for(int i=0;i<a.length;i++) {
//		System.out.println("array after sorting: " + a[i]);
//	}
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			    temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
	
}
}

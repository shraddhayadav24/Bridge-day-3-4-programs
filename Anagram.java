package com.bridgeday1.pb;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="listen";
	String s2="silent";
	
	
	if(s1.length()== s2.length()) {
		
	char [] array1=s1.toCharArray();
	char [] array2=s2.toCharArray();
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	
	boolean result = Arrays.equals(array1, array2);
	
	if(result) {
		System.out.println("String are anagrams");
	}else {
		System.out.println("String is not anagram");
	}
	
}
}
}
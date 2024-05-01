package com.bridgeday1.pb;

public class WordWithEvenLength {
public static void main(String[] args) {
	
	String str="Seashore sell by sea";
	
	String word[]=str.split(" ");
	
	for(int i=0; i< word.length; i++) {
		if(word.length % 2 == 0) {
			System.out.println(word);
		}
	}
	
}
}

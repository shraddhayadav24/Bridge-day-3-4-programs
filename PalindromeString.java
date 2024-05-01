package com.bridgeday1.pb;



public class PalindromeString {
public static void main(String[] args) {
	String original="radar";
	String revstring="";
	int length=original.length()-1;
	for(int i=length;i>=0;i--) {
		revstring = revstring + original.charAt(i); 
	}
	System.out.println(revstring);

	if(revstring.equals(original)) {
		System.out.println("String is palindrome");
	}
	else {
		System.out.println("String is not Palindrome");
	}

}
}

package com.vikram;

public class DeleteAlternateCharacters {
	
	public static String delAlternate(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i=0; i<S.length(); i+=2){
            str.append(S.charAt(i));
        }
        
        return str.toString();
    }
	
	
	public static void main(String[] args) {
		String s = "HelloJavaDevelopers";
		System.out.println(delAlternate(s));
		
	}

}

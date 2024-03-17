/*Given a string s consisting of words and spaces, return the length of the last word in the string.
 
 */

package com.vikram;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // Output: 5
    }

    public static int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // Find the index of the last space
        int lastIndex = s.lastIndexOf(' ');

        // Return the length of the last word
        return s.length() - lastIndex - 1;
    }
}

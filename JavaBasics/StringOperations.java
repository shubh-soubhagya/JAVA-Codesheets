import java.io.*;
import java.util.*;

class StringOperations{
    public static void main(String[] args){
        
        // Returns the number of characters in the String.
        String s = "ShubhSoubhagya";
        System.out.println("String lenght: " + s.length());
        
        // Returns the character at ith index.
        System.out.println("Character at 3rd Position= " + s.charAt(3));
        
        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring: " + s.substring(3));
        
        // Returns the substring from i to j-1 index.
        System.out.println("Substring :" + s.substring(2,5));
        
        // Concatenates string2 to the end of string1.
        String s1 = "Shubh";
        String s2 = "Soubhagya";
        System.out.println("Concatenated String : " + s1.concat(s2));
        
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share: "+s4.indexOf("Share"));
        
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a: "+s4.indexOf('a',3));
        
        // Checking equality of Strings
        Boolean out1 = "Shubh".equals("shubh");
        System.out.println("Checking Equality: "+ out1);
        Boolean out2 = "Shubh".equals("Shubh");
        System.out.println("Checking Equality: "+ out2);
        
        Boolean out3 = "Shubh".equalsIgnoreCase("ShUBh");
        System.out.println("Checking Equality: "+ out3);
        
        //If ASCII difference is zero then the two strings are similar
        int out4 = s1.compareTo(s2);
        System.out.println("The difference between ASCII value is ="+out4);
        
        // Converting cases
        String word1 = "SHUBH";
        System.out.println("Changing to lowercase : "+word1.toLowerCase());
        
        // Converting cases
        String word2 ="Soubhagya";
        System.out.println("Changing to Uppercase: " + word2.toUpperCase());
        
        // Trimming the word
        String word4 = "Learn Share Learn";
        System.out.println("Trim the Word: "+word4.trim());
        
        // Replacing characters
        String str1 = "HhubhHoubhagya";
        System.out.println("Original String: " + str1);
        String str2 = "HhubhHoubhagya".replace('H','S');
        System.out.println("Replaced H with S -> " + str2);
        
    }
}
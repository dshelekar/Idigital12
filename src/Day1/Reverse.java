package Day1;

import java.util.Scanner;

//java program to reverse a word
/*
import java.io.*;
import java.util.Scanner;

class ReverseString {
	public static void main (String[] args) {
	
		String str= "Geeks", nstr="";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println("Geeks"); //Example word
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ nstr);
	}
}*/

public class Reverse   
{    
   public static void main(String[] args) {    
       String string = "Dream big";    
       //Stores the reverse of given string    
       String reversedStr = "";    
           
       //Iterate through the string from last and add each character to variable reversedStr    
       for(int i = string.length()-1; i >= 0; i--){    
           reversedStr = reversedStr + string.charAt(i);    
       }    
           
       System.out.println("Original string: " + string);    
       //Displays the reverse of given string    
       System.out.println("Reverse of given string: " + reversedStr);    
   }    
}    
/*
class ReverseStringExample1  
{  
public static void main(String args[])  
{  
String s;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a String: ");  
s=sc.nextLine();                    //reading string from user  
System.out.print("After reverse string is: ");  
for(int i=s.length();i>0;--i)                //i is the length of the string  
{  
System.out.print(s.charAt(i-1));            //printing the character at index i-1  




}
}  
} */


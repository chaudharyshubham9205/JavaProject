/*Create a method named countVowels that takes String as input and convert it into 
an array of characters  and returns the number of vowels in the array. */

import java.util.*;
public class countVowels {
	
	void countVowel(String str) {
		int strLength= str.length();
		//Creating array of string length
		char []arr= new char[strLength];
		int i;
		//Copying string character into array 
		for(i=0;i<strLength;i++) {
			arr[i]=str.charAt(i);
			
		}
		//Showing characters in array format
		System.out.print("The Array is: ");
		for(i=0;i<strLength;i++) {
			System.out.print(" "+ arr[i]+" ");
		}
		System.out.println(" ");
		
		//Print vowels	
		int count=0;
		System.out.print("The Vowels: ");
		for(i=0;i<strLength;i++) {
			if(arr[i]=='a'||arr[i]=='e'
					||arr[i]=='i'||arr[i]=='o'||
					arr[i]=='u') {
				System.out.print(" "+arr[i]+" ");
				count+=1;
				
			}
			
		}
		System.out.println(" ");
		System.out.println("The Number of Vowels: "+ count);

		
		//Exception
		try {
			for(i=0;i<strLength;i++) {
				if(arr[i]=='x') throw new Exception();
				
			}
		}catch(Exception a) {
			System.out.println("Oops! Exception as array contains x");
		}
			
		
	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter any string: ");
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		
		countVowels obj= new countVowels();
		obj.countVowel(str);
		
		
	}
}

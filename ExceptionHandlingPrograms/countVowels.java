 /* Create a method named countVowels that take a String as input and convert it into  an array of
characters  and returns the number of vowels in the array.
Furthermore, the method should throw a checked exception if the array contains the letter 'x' */

import java.util.*;
public class countVowels {
	
	int countVowel(String str) {
		
		int c=0; 
		str=str.toUpperCase();
		
        //Storing String in Char array
		char ArrayChar[] = str.toCharArray();
        
		for(int i=0;i<ArrayChar.length;i++)
		{
         //comparing every index value one by one if char is vowel counter will increment by 1 every time
			if( (ArrayChar[i]=='A') || (ArrayChar[i]=='E') || (ArrayChar[i]=='I') || (ArrayChar[i]=='O') ||  (ArrayChar[i]=='U')   )
				c++;
          //if any index value is matched to x than Exception will be throw 
			if(ArrayChar[i]=='X') {
				try {
					throw new Exception();
				}
				catch(Exception e) {
					System.out.println("Exception contains in the letter x");
				}
			}
		}

		return c;
	}

	public static void main(String[] args) {

		countVowels cv = new countVowels();

//		creating instance of class Scanner for accept values from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=s.next();
		int result = cv.countVowel(str);

		System.out.println("Total Number of the Vowels are presents : "+result);

		s.close();
	}
}
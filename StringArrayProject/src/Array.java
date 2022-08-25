/* Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and
Cathy, and another one containing int values: 15,9, 14, 10,and 12.
 create an  table showing  these values as name value pairs as below.

Name        Value

Amy		     9
Boyd		10
Cathy		12
John		14
Peter		15 */

import java.util.Arrays;
public class Array {	
	public static void main(String[] args)
	   // The Main Method is here	
	{  // Names of Array
		String[] str= { "Peter","Amy","John","Boyd","Cathy"};
		// Values of Array
	    int[] arr= { 15,9,14,10,12};
			Arrays.sort(str);
			Arrays.sort(arr);
			System.out.println("Name    Values");
					
			// print the string and number of values after sorting
			for(int i=0; i<arr.length|| i< str.length;i++)
			{		
				System.out.println(str[i]+"      "+arr[i]);
				
			}	
	  }
}

/* Write a method that takes a String and returns a String of the
same length containing the 'X' character in all positions except the
last 4 positions. The characters in the last 4 positions must be the
same as in the original string. */
import java.util.Scanner;
public class ReturnStringContainingX {
	
		// The Main Method is here
		String display()
		{
			 Scanner sc=new Scanner(System.in);
			 //taking input String from the user
		       System.out.println("Enter the String: ");
		       String str=sc.nextLine();
		       if(str.length()>4)
		       {  
		    	 
		    	   String replaceCharExceptlast4=str.substring(0,str.length()-4);
		    	   String replaceString="x".repeat(replaceCharExceptlast4.length());
		    	   replaceString=replaceString+str.substring(str.length()-4);
		    	   
		    	   System.out.println(replaceString);
		       }
		       else
		       {
		    	   System.out.println("The Length of String should be greater than four");
		       }
		       sc.close();
		      // Returning Str;
			   return str;		       
			}
		public static void main(String args[])		
		{
			// creating instance of class ReplaceCharsToX for invoking its method
			ReturnStringContainingX  obj=new ReturnStringContainingX();
			//Here the method is display()
			obj.display();
		}
}

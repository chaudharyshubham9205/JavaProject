/* The exceptions the code may throw along with the handler message are listed below:
Division by zero: Print "Invalid division".
String parsed to a numeric variable : Print "Format mismatch".
Exceptions other than mentioned above : Any other exception except the above ones fall in this category.
 Print "Exception encountered".
Finally, after the exception is handled, print "Exception Handling Completed". */

import java.util.Scanner;
import java.lang.Exception;

public class ExceptionTest {
	public static void main(String args[])
	   {
		//creating instance of class Scanner for accept values from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		String str1=sc.nextLine();
		String str2=sc.nextLine();

		try
		{
		int x=Integer.parseInt(str1);
		int y=Integer.parseInt(str2);
		//converting String values into integer for arithmetic calculation 
		int z=x/y;
		System.out.println("Divide value of x and y:"+z);			
	    }		
		catch(NumberFormatException ex)
		{
			System.out.println("Format Mismatch ");
		}
		//Exception occur when number is divided by 0
		catch(Exception e)
		{
			System.out.println("Divide by the zero is invalid division"+e);
		}
		
		finally
		{
			//this block executed once whenever any exception occur or not
			System.out.println("Exception Encountered");
		}
		System.out.println("Exception Handling Completed");
	}			
}
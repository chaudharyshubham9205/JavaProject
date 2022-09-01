// Write a program to count number of char in a string entered by user excluding space.
import java.util.*;
public class CountString {
	
		void display()
		{
			int count = 0;
			//Create an instance of the Scanner Class
			Scanner s= new Scanner(System.in);
			//Take input from the user
			System.out.println("Enter the String : ");
			String sc = s.nextLine();
			for (int i=0; i<sc.length();i++)
			{
				if (sc.charAt(i)!=' ') // to ignore spaces
				{
					count++;
				}
			}
			//Print Output
			System.out.println("Count of char. in String "+count);
			
		}	
			
		public static void main(String[] args)
		{
			CountString obj= new CountString ();
			obj.display();
		}
	}

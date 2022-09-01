 // Write a program to print table of any number input by user.
import java.util.*;
public class PrintTable {

		void display()
		{
			
		    //Create an instance of the Scanner Class
			Scanner sc= new Scanner(System.in);
			//Take input from the user
			System.out.println("Enter number for the table : ");
			int table = sc.nextInt();
			 
			for(int i = 1; i<=10;i++ )
			{
				//Print Output
				System.out.println(table*i);
			}
			
		}
		
		public static void main(String[] args)
		{
			PrintTable obj= new PrintTable ();
			obj.display();
		}
	}

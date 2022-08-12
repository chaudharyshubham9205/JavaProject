
	//Write a Java program to find factorial of a number
	import java.util.*;
	public class Factorial
	{
	     public static void main(String []args)
	     {
	        //Take input from the user
	        //Create an instance of the Scanner Class
	        Scanner sc=new Scanner(System.in);
	        //Declare and Initialize the variable
	        System.out.println("Enter the number: ");
	        int num=sc.nextInt();
	        int i=1,factorial=1;
	        while(i<=num)
	        {
	        	factorial=factorial*i;
	            i++;
	        }
	        System.out.println("Factorial of the number: "+factorial);  
	     }   
	}

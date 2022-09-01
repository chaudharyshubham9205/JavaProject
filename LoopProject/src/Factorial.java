/*Write a method to find factorial of a number input by user.
factorial(int n).call this methods from main() and pass argument n .
Repeat this untill user enters no. */
import java.util.Scanner;
public class Factorial {
	public static void main(String []args)
    {
       
       //Create an instance of the Scanner Class
       Scanner sc=new Scanner(System.in);
       //Take input from the user
       System.out.println("Enter your number: ");
       //Declare and Initialize the variable
       int num=sc.nextInt();
       int i=1,fact=1;
       do
       {
    	   fact=fact*i;
           i++;  
       }
       while(i<=num);
      //Print Output
       System.out.println("Factorial of the given number: "+fact);  
    }   

}
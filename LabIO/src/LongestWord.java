/*
 3.Write a Java program to find the longest word in a text file.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class LongestWord {
	//The main method
   public static void main(String [ ] args)
   throws FileNotFoundException 
   {
   new LongestWord().findLongestWords();
   }
   public String findLongestWords() throws FileNotFoundException {
   String longest_word = " ";
   String current;
   Scanner sc =new Scanner(new File("C:\\Users\\Vipin\\Desktop\\JAVA\\javaIntro.txt"));
   while (sc.hasNext()) {
   current = sc.next();
   if (current.length() > longest_word.length()) {
   longest_word = current;
   }
   }
   //Print longest Word in file
   System.out.println("The longest word is: "+longest_word+"\n");
   //returning the longest word in file
   return longest_word;
   }
}

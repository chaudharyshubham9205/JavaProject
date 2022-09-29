/*
 1. Write a java program to read a file line by line and store it into a variable.
 */
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class ReadFile {
        //main method
	public static void main(String[] args) throws IOException {
		//static method
		lineByLineReading();
	}
	public static void lineByLineReading()   {
		String s_Line="";
		String s_Data="";
		
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Vipin\\Desktop\\JAVA\\javaIntro.txt"));
			//traversing the file till the last line by using while loop
			while(s_Line!=null)
			{
				if(s_Line==null)
					break;
					s_Data =s_Data+ s_Line;
	                s_Line = br.readLine();
			}
	              System.out.println(s_Data);
	             br.close();
			}
		catch(FileNotFoundException e)
		{
			System.out.println("Unable to find the file");
		}
		catch(IOException e)
		{
			System.out.println("Unable to find the file");
		}
	}
}
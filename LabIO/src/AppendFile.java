/*
 2.Write a Java program to append text to an existing file.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendFile {
//The main method
	public static void main(String[] args)
	{
		appendMethod();
	}
	public static void appendMethod()
	{
		//creating the object of file
		File f=new File("C:\\Users\\Vipin\\Desktop\\JAVA\\javaIntro.txt");
		try {
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.append(" The Java codes are first compiled into byte code (machine-independent code).");
			
			System.out.println("Data is successfully appended in the exisiting file \n");
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
		}
		catch (IOException e) {
		
			e.printStackTrace();
		}
	
	}
}
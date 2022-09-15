/*
3. WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103.
 */

import java.util.HashMap;
import java.util.Set;
public class StudentMap 
{
	//The main method
	public static void main(String args[]) 
	{
		//Creating object of HashMap
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(101,"Sonu");
		hm.put(102,"Vipin");
		hm.put(103,"Satendra");
		hm.put(104,"Jayesh");
		hm.put(105,"Pankaj");
		Set<Integer> keys=hm.keySet();
	
		for(Integer stu:keys)
		{
			//Condition to print which is greater 103
			if(stu.intValue()>103)
			{
				System.out.println(hm.get(stu));
			}
		}
		
	}
}
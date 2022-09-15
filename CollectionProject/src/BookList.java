/*
 1.WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print elements of both ArrayLists one on one line.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class BookList  
{
	public static void main(String args[])
	{
		ContainsList();
	}	
	public static void ContainsList()
	{
       ArrayList list1=new ArrayList();
        //First array list object
		Book ob1=new Book(101,"Meditation and Its Methods","Swami Vivekananda");
		Book ob2=new Book(102,"Effective Java","Joshua Bloch");
		Book ob3=new Book(103,"Fluent Python","Luciano Ramalho");
		
		ArrayList list2=new ArrayList();
		//Second array list object
		Book ob4=new Book(104,"Head First Ruby","Jay McGavren");
		Book ob5=new Book(105,"C# in Depth ","Jon Skeet");
		Book ob6=new Book(106,"Eloquent JavaScript","Marijn Haverbeke");
		
		list1.add(ob1);
		list1.add(ob2);
		list1.add(ob3);
		
		list2.add(ob4);
		list2.add(ob5);
		list2.add(ob6);
		//To print first array list
		System.out.println("List1 conatining objects "+"\n");
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println("Array list1 output: "+it.next());
		}
		System.out.println("\n");
		//To print second array list
		System.out.println("List2 conatining objects "+"\n");
		Iterator it2=list2.iterator();
		while(it2.hasNext())
		{
		System.out.println("Array list2 output: "+it2.next());
		}
	}
}
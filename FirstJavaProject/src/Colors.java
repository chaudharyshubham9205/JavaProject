import java.util.*;
public class Colors {
	  public static void main(String[] args) {
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Orange");
	  list_Strings.add("Blue");
	  list_Strings.add("Green");
	  list_Strings.add("Red");
	  list_Strings.add("Black");
	  list_Strings.add("White");
	  System.out.println(list_Strings);
	 
	  System.out.println("Array list before Swap:");
      for(String a: list_Strings){
      System.out.println(a);
    }
      //Swapping 1st(index 0) element with the 3rd(index 2) element
     Collections.swap(list_Strings, 0, 2);
      System.out.println("Array list after swap:");
      for(String b: list_Strings){
      System.out.println(b);
     }
	}
}
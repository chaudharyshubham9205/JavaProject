/* Write a method that takes a String[] as an argument and returns
a String containing the concatenation of all the strings in the
input array. Invoke your method 3 times with different arguments. Make
sure that your code handles the cases where the argument is null. */

public class StringAndArray {
	static String strConcatenation(String str[])
	  // The Main Method is here
	{
		StringBuilder builder = new StringBuilder();;
		try {
        //throwing an exception when str is empty
			if(str==null) {
				throw new Exception();
			}

			for(String s : str) {
				builder.append(s+" ");
			}
		}
		catch(Exception e)
		{
			// The null message print here
			System.out.print("The Value of Array Can't Null");
		}
         //return String 
		return builder.toString();
	}
	public static void main(String[] args) {
          //Array of Strings
		String str1[]= null;
		String str2[]= {"Spring","Tool","Suite"};
		String str3[]= {"Java","Programming"};

        //The three times strConcatenation are Invoked
		System.out.println(strConcatenation(str1));
		System.out.println(strConcatenation(str2));
		System.out.println(strConcatenation(str3));

	}
}


/*Create a method int sum(int[] values, int start, int end) that throws an IllegalArgumentException
when passed an array of length 0, a NullPointerException when passed a null, and ArrayIndexOutOfBoundsException when start and
end do not fall within the range of the given array. */
 
import java.lang.*;
import java.util.*;
public class ExceptionHandling {
	int sum(int[] values) {
		int i,sum=0;
		
		//Length of the Array 
		int arrLenght=values.length;   
	
		try {
			if(values.length==0) throw new IllegalArgumentException();
			
		}catch(IllegalArgumentException e) {
			System.out.println("Oops! Illegal Argument");
			return 0;
		}
		
		//Null Pointer Exception
		try {
			for(i=0;i<arrLenght;i++) {
				sum+=values[i];
			}
			
		}catch(NullPointerException e) {
			System.out.println("Oops! The Array is the null");
			return 0;
		}
		
		for(i=0;i<arrLenght;i++) {
			sum+=values[i];
		}
	
		return sum;
	}
	public static void main(String args[]) {
		int []arr= {1,4,3,2};
		ExceptionHandling obj= new ExceptionHandling();
		obj.sum(arr);
	}
}



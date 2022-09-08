
public class Rectangle extends Square implements Shape {
public int width=15;
	
// Override area method
	public int area()
	{
		int ar=2*length*width;
		return ar;
	}

}

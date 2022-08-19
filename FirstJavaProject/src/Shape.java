/*
  Create a class named 'Shape' with a method to print "This is This is shape".
 Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print
 "This is rectangular shape" and "This is circular shape" respectively.
 Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
 Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
 */
public class Shape {
		  public void print_shape(){
		    System.out.println("This is Shape");
		  }
		}

		// Rectangle class is subclass of Shape class
		class Rectangle extends Shape{
		  public void print_rect(){
		    System.out.println("This is Rectangular Shape");
		  }
		}

		// Circle class is subclass of Shape class
		class Circle extends Shape{
		  public void print_circle(){
		    System.out.println("This is Circular Shape");
		  }
		}

		// Square class is subclass of Rectangle class
		class Square extends Rectangle{
		  public void print_square(){
		    System.out.println("Square is a Rectangle");
		  }
	}


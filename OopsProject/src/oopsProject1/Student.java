/*
 2.Create a class  Student with four data members and constructors-   
Institute name---it should be static and final.
  rollno.
  name
  age
Generate getter /setter and Override toString();
In the main class make 3 objects of Student  ...set their values and and print details.
 */
package oopsProject1;

public class Student
{
	private String name;
	private int age;
	private int rollno;
	final static String institute="ANUDIP FOUNDATION";
	public Student()
	{
		super();
	}
	
	public static String getInstitute() {
		return institute;
	}

	public Student(String name, int age, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
//	Override toString method for printing values of object
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
	}
	
}
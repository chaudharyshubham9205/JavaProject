package oopsProject1;

public class StudentMain extends Student
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setName("Shubham Chaudhary");
		s1.setAge(24);
		s1.setRollno(57);
		Student s2=new Student();
		s2.setName("Vipin Chaudhary");
		s2.setAge(29);
		s2.setRollno(59);
		
       //printing values of Student objects
		
		System.out.println(s1.getInstitute());
		System.out.println("\nName : "+s1.getName());
		System.out.println("Age : "+s1.getAge());
		System.out.println("Roll Number : "+s1.getRollno());

		System.out.println("\nName : "+s2.getName());
		System.out.println("Age : "+s2.getAge());
		System.out.println("Roll Number : "+s2.getRollno());
	}

}
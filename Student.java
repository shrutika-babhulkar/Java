//Write a Java Program to demonstrate the use of static variable, static block and static
//method.

class Student
{
	int roll_no;
	String name;
	static String college_name="DYP";
	
	Student(int r, String n)
	{
		roll_no=r;
		name = n;
	}
	
	static void change()
	{
		college_name="DYPcet";
	}
	
		static 
	{
		System.out.println("Welcome..");
	}
	
	void display()
	{
		System.out.println("Student Name: "+ name);
		System.out.println("Student Roll NO. : "+roll_no);
		System.out.println("College Name : "+college_name);
		
	}
	

	public static void main (String []args)
	{
		Student.change();
		Student s1 = new Student(1,"Shruti");
		Student s2 = new Student(2,"Shraddha");
		
		s1.display();
		s2.display();
	}
}
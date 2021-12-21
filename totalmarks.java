import java.util.*;
class student
{
	void details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of student:");
		String name=sc.next();
		System.out.println("Enter roll-number:");
		int roll=sc.nextInt();
	}
}
class test extends student
{
	float mat,java,py,soc,ds,cp;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of six Subjects:");
		System.out.println("Maths:");
		mat=sc.nextFloat();
		System.out.println("Java");
		java=sc.nextFloat();
		System.out.println("Python");
		py=sc.nextFloat();
		System.out.println("SOC");
		soc=sc.nextFloat();
		System.out.println("Data Structures");
		ds=sc.nextFloat();
		System.out.println("C Programming");
		cp=sc.nextFloat();
	}
}
class result extends test
{
void prin()
{
        read();
	float sum;
	sum=mat+java+py+soc+ds+cp;
	System.out.println("Total marks:"+sum);
}
}
class totalmarks
{
	public static void main(String args[])
	{
		result r=new result();
		r.details();
		r.prin();
	}
}	

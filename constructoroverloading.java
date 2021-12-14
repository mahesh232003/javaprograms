import java.util.*;
class shape
{
 	int length,breadth,height;
	shape()
	{
		System.out.println("No area to print");
	}
	shape(int len)
	{
		length=breadth=height=len;
	}
	shape(int len,int h)
	{
		length=breadth=len;
		height=h;
	}
	shape(int l, int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	void display()
	{
		int volume;
		volume=length*breadth*height;
		System.out.println("Volume of box is:"+volume);
	}
}
class constructoroverloading
{
	public static void main(String args[])
	{
		shape s1=new shape();
		System.out.println("Default constructor");
		s1.display();
		shape s2=new shape(3);
		System.out.println("One parameter constructor");
		s2.display();
		shape s3=new shape(4,3);
		System.out.println("Two parameter constructor");
		s3.display();
		shape s4=new shape(3,4,5);
		System.out.println("Three parameter constructor");
		s4.display();
	}
}

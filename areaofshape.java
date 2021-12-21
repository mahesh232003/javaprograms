import java.util.*;
class figure
{
	double length,breadth,area1;
	void area()
	{
		area1=0;
	}
}
class Rectangle extends figure
{
	double length,breadth,area1;
	Rectangle(double l,double b)
	{
		this.length=l;
		this.breadth=b;
	}
	void area()
	{
		area1=length*breadth;
		System.out.println("Area of rectangle is:"+area1);
	}
}
class Triangle extends figure
{
	double height,base,area1;
	Triangle(double h,double b)
	{
		this.height=h;
		this.base=b;
	}
	void area()
	{
		area1=0.5*height*base;
		System.out.println("Arae of triangle is:"+area1);
	}
}
class areaofshape
{
	public static void main(String args[])
	{
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and height");
		l=sc.nextDouble();
		System.out.println("Enter breadth and base");
		b=sc.nextDouble();
		Rectangle r=new Rectangle(l,b);
		Triangle t=new Triangle(l,b);
		System.out.println("Rectangle class called");
		r.area();
		System.out.println("Triangle class called");
		t.area();
	}
}
				

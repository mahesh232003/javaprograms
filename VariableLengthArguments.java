import java.util.Scanner;
class VariableLengthArguments
{
	static void fun(String b,int... a)
	{
		int sum=0;
		System.out.println("Number of arguments: "+a.length);
		System.out.println("String given is: "+b);
		for (int i:a)
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.println("Sum of given numbers is:"+sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		fun(b,10);
		fun(b,1,2,3,4);
		fun(b);
	}
}

import java.util.Scanner;
class employee1
{
	void reademp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of employee:");
		String name=sc.next();
		System.out.println("Enter id");
		String id=sc.next();
		System.out.println("Enter designation");
		String desig=sc.next();
	}
}
class salary extends employee1
{
	float BP,HRA,DA,PF,np;
	void readsalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		BP=sc.nextFloat();
		System.out.println("Enter House Rent Allowance");
		HRA=sc.nextFloat();
		System.out.println("Enter Dearness Allowance");
		DA=sc.nextFloat();
		System.out.println("Enter Provident Found");
		PF=sc.nextFloat();
	}
	void calculatesalary()
	{
		np=BP+HRA+DA-PF;
	}
	void displayemp()
	{
		System.out.println("Salary of employye is:"+np);	
	}	
			
}
class employee
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of employees");
		n=sc.nextInt();
		salary arr[]=new salary[n];
		for(int i=1;i<=n;i++)
		{
			arr[i-1]=new salary();		
			System.out.println("Enter employee details");
			arr[i-1].reademp();
			arr[i-1].readsalary();
			arr[i-1].calculatesalary();
			arr[i-1].displayemp();
		}
	}
}


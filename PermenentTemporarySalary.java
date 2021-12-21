import java.util.*;
class employee
{
	String name,id;
	double salary;
	void read_emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter id");
		id=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextDouble();
	}
}
class temporary_employee extends employee
{
	double tempsalary;
	void print_emp()
	{
		read_emp();
		tempsalary=salary+(salary*0.035);
		System.out.println("salary after 3.5% increment:"+tempsalary);
	}
}
class permenent_employee extends employee
{
	double persalary;
	void print_emp()
	{
		read_emp();
		persalary=salary+(salary*0.05);
		System.out.println("Salary after 5% increment:"+persalary);
	}
}
class PermenentTemporary
{
	public static void main(String args[])
	{
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee details\n1:permenent\n2:temporary");
		c=sc.nextInt();
		if (c==1)
		{
			permenent_employee pe=new permenent_employee();
			pe.print_emp();
		}
		else
		{
			temporary_employee te=new temporary_employee();
			te.print_emp();
		}
	}
}

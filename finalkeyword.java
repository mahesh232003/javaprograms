class sample
{
    final int a=10;
    void display()
    {
        System.out.println("The value of a is fixed:"+a);
    }
}
class A extends sample
{
    void display()
    {
        System.out.println("Class A display method");
    }
}
class Main 
{
    public static void main(String args[])
    {
        A s=new A();
        s.display();
    }
}

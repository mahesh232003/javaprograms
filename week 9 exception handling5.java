//case 2 of finally block if exception is not handled
class TestFinallyBlock1
{
  public static void main(String args[])
  {
    try
    {
      System.out.println("Inside the try block");
      //below code throws divide by zero exception
      int data=25/0;
      System.out.println(data);
    }
    //cannot handle Arithmetic type exception
    //can only accept Null Pointer type exception
    catch(NullPointerException e)
    {
      System.out.println(e);
    }
    //executes regardless of exception occured or not
    finally 
    {
      System.out.println("finally block is always executed");
    }
    System.out.println("rest of the code...");
  } 
}



/*output
finally block is always executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at TestFinallyBlock1.main(TestFinallyBlock1.java:9)
        */

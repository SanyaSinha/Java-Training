//program for abstaction and non abstraction
abstract class Test
{
  abstract void m1();                       //defining abstract methods in abstact class
  abstract void m2();
  abstract void m3();
   void m4()
  {
    System.out.println("m4 is non abstract method");
  }
}

class AbstractNonAbstact extends Test
{
    void m1()
    {
     System.out.println("m1 is abstract method");
    }

    void m2()
    {
      System.out.println("m1 is abstract method");
    }
    void m3()
    {
      System.out.println("m3 is abstract method");
    }

    public static void main(String args[])
    {
      AbstractNonAbstact t1= new AbstractNonAbstact();
      t1.m1();
      t1.m2();
      t1.m3();
      t1.m4();
      Test t= new AbstractNonAbstact();
      t.m1();
      t.m2();
      t.m3();
      t.m4();
    }
}



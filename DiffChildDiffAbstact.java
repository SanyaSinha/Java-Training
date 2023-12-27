//If the child class is unable to provide implementation of 
//all method of abstract class then we can declare the child
//with abstract modifier and complete the remaining method
//implementations in next created child classes;
//DIFFERENT CHILD DIFFERENT ABSTRACTION
abstract class Test
{
  abstract void m1();
  abstract void m2();
  abstract void m3();
  void m4()
  {
    System.out.println("I am method m4");
  }
}
abstract class Test1 extends Test
{
   void m2()
   {
    System.out.println("I am method m2");
   }
}
abstract class Test2 extends Test1
{
    void m1()
    {
      System.out.println("I am method m1");
    }
}
// abstract class Test3 extends Test2
// {
//    void m3()
//    {
//       System.out.println("I am method m3");
//    }
// }
class DiffChildDiffAbstact extends Test2
{
   void m3()
   {
       System.out.println("I am method m3");
    }
    public static void main(String args[])
    {
        DiffChildDiffAbstact t = new DiffChildDiffAbstact();
        t.m1();
                t.m2();
                        t.m3();
                                t.m4();
    }
}

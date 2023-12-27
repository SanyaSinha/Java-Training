//overloading interface method
interface It1{
    double m1(int a,String str);
    int m1(char ch);
}
class Test implements It1
{
  public double m1(int a,String str) {
    System.out.println("m1 2-arguments method");
    return 22.2;
  }

  public int m1(char ch)
  {
    System.out.println("m1 1-arguments method");
    return 40;
  }

  public static void main (String args[]){
    Test t= new Test();
    int i = t.m1('p');
    System.out.println("Values=" +i);
    double d = t.m1(22,"Sanya");
    System.out.println("Values=" +d);
  }
}
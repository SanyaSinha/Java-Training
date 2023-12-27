 class A{                      //B cannot inherit from A class as A is a Final class

}                                                  //here the error is the ouput hehehehehehe
class B extends A{
    void demo(){
        System.out.println("I am in A");
    }
public static void main(String args[])
{
    B obj= new B();
    obj.demo();
}
}
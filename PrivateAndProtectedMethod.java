class Parent{
    protected void display()
    {
        System.out.println("i am protected");
    }
    private void show(){
        System.out.println("hello i am private");
    }
    void accessPvtMethod()
    {
        show();
    }
}

class Child extends Parent{
    protected void display(){
        System.out.println("HELLO I AM Protected METHOD");
    }
    // void show(){                            //cannot be defined here as it is private
    //     System.out.println("HELLO I AM Private METHOD");
    //     }

}
class PrivateAndProtectedMethod{
public static void main(String args[])
{
    Child c= new Child();
    c.display();
    c.accessPvtMethod();
}
}
//code is correct but not working in my compiler
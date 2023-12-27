abstract class AbstractMethod{
    abstract void hy();
}


class Sanya extends AbstractMethod{
    void hy(){
        System.out.println("I am an abstract method defined in child class");
    }

public static void main(String args[]){
    Sanya sc = new Sanya();
    sc.hy();
}
}
///up is when we dont define a main class before public static void main
///down is when we define a MAIN CLASS BEFORE public static void main

// abstract class Test{
//     abstract void hy();
// }


// class Sanya extends Test{
//     void hy(){
//         System.out.println("I am abstract method defined in child class");
//     }
// }
// class AbstractMethod{

// public static void main(String args[]){
//     Sanya sinha = new Sanya();
//     sinha.hy();
// }
// }
//when child class has both abstract class method and its own defined method
abstract class Parent {
    int a = 5;
    int b = 8;
    abstract void add();
}

class Child extends Parent {
    public void add() {
        System.out.println("Addition is: " + (a + b));
    }

    public void display() {
        System.out.println("I am in Child class");
    }
}
 class AbstractMain{
    public static void main(String args[]) {
        Child i = new Child();
        i.display();
        i.add();
    }
 }
 //my compiler issue otherwise the code is correct
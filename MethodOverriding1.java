class Parent{
    public void Car(){
        System.out.println("This parent owns BMW");             //here the car method can be changed in child class
    }
}
class Child extends Parent{
    public void Car(){
        System.out.println("This child wants Ferrari");
    }
               }
class MethodOverriding1{
    public static void main(String args[]){
        Child c=new Child ();
        c.Car();     
    }
}           
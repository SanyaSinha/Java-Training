// class Inheritence {
//     public static void main(String args[]){
//     B obj=new B();
//     obj.showA();
//     obj.showA();
//     }
 
//     class A{
//         public void showA(){
//             System.out.println("I am in class A");
//         }
//     }
//     class B extends A{
//         public void showB(){
//             System.out.println("I am in class B");
//         }
//     }
//     }
    

    class A{
        public void showA(){
            System.out.println("I am in class A");
        }
    }
    class B extends A{
        public void showB(){
            System.out.println("I am in class B");
        }
    }
    class Inheritance {
    public static void main(String args[]){
    B obj=new B();
    obj.showA();
    obj.showA();
    }
    }
    //this is correct but my compiler has a issue
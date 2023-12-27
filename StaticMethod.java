class StaticMethod{
      static void display(){
        System.out.println("hello I am inside static method");
    }
    public static void main(String args[]){
         display();
    }
}


// class StaticMethod{
//       static void display(){
//         System.out.println("hello I am inside non static method");          non static or instance method as it requires an object sc here to call the mesthod
//     }
//     public static void main(String args[]){
//         StaticMethod sc = new StaticMethod();
//         sc.display();
     
//     }
// }

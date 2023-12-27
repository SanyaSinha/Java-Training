//  class NonStaticMethod {
//    static void dance(){                      //if i remove static word from here then it will throw error
//         System.out.println("She dances");          //that non static method cant be accessed like static method
//     }

// public static void main (String args[]){
//     NonStaticMethod.dance();
// }
//  }

     class NonStaticMethod {
   void dance(){
        System.out.println("She dances");
    }

public static void main (String args[]){
    NonStaticMethod r = new NonStaticMethod();
    r.dance();
}
 }

    
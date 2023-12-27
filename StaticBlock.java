class StaticKeyword {
    //Static variable
    static int num= staticMethod();

    //static block
    static{
        System.out.println("Inside static block");

    }
   //static method
   static int staticMethod(){                                 //using int here and not void cause we are returning int value here
   System.out.println("from static method");
   return 40;
}

//static main method
public static void main(String args[]){
    System.out.println("num: "+num);
    System.out.println("from main");
}

}
//first of all static method gets implemented then static block gets printed and then main method gets implemented
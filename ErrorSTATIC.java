class ErrorSTATIC                                                  //use static here before int n 
// {

//     static int n;                                               
//     public static void main(String[] args) {
//         n=10;
//         System.out.println("VALUE OF n: "+n);

//     }
// }



// {
//     public static void main(String[] args) {                 
//         System.out.println("I am in main");                                 //print static first then main method
//     }
//     static{
//         System.out.println("I am in static block");
//     }
// }



// {
//    static int i=10;                                             //we use static here
//     static
//     {
//         System.out.println(i);
//     }
//     public static void main(String[] args)
//     {
//         int j=20;                                               //we dont use static here
//         System.out.println(j);
//     }
// }




// {
//     static int n;
//     static{
//         n++;
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         n++;
//         System.out.println(n);
//     }
// }


{
     {
        System.out.println("I am in non static block");      //the area bw class and static block is called non static block
     }
      
     static                                                  //we dont have static method here so first static block gets printed then main method gets printed and non static block doesn't get printed here
     {
    System.out.println("I am in static block");
     }
     public static void main(String[] args)
      {
        System.out.println("I am in main");
     }




}



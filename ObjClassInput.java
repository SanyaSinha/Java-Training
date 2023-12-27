// import java.util.Scanner;
// public class ObjClassInput {
//     int len,width;
//     public static void main(String args[]){
//   Scanner sc= new Scanner(System.in);
//   ObjClassInput l = new ObjClassInput();
//   System.out.println("Length is ");
//   l.len=sc.nextInt();                            //here I have created two different reference variables l and b
//   ObjClassInput b= new ObjClassInput();
//    System.out.println("Width is ");
//    b.width=sc.nextInt();
//   System.out.println("Area is "+(l.len*b.width));
//   sc.close();
//     }    
// }


import java.util.Scanner;
public class ObjClassInput {
    int len,width;
    public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  ObjClassInput rec = new ObjClassInput();           //here I have created only one reference variable rec 
  System.out.println("Length is ");
  rec.len=sc.nextInt();
  // ObjClassInput b= new ObjClassInput();
   System.out.println("Width is ");
   rec.width=sc.nextInt();
  System.out.println("Area is "+(rec.len*rec.width));
  sc.close();
    }    
}

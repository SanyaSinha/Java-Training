import java.util.Scanner;
class DetailAdd {
     Scanner sc=new Scanner(System.in);
     int i;
     String name[]= new String[10];
     int phnum[]= new int[10];

   
   
     void name(){
        // String name[]= new String[6];
        System.out.println("enter your name");
        // Scanner sc=new Scanner(System.in);
        name[i]=sc.nextLine();
        // i++;
    }

    void phone(){
        // int phnum[]= new int[6];
        System.out.println("enter your phone num");
        // Scanner sc=new Scanner(System.in);
        phnum[i]=sc.nextInt();
        i++;
    }
    

    void show(){
        System.out.println("Name \t PhoneNo");
        System.out.println("''''''''''''''''''''''''''");
        for(int k =0;k<i;k++){
            System.out.println(name[k]+ "\t" +phnum[k]);
        }
    }


    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        DetailAdd m = new DetailAdd();
    while(true){
   System.out.println("option 1 for name");
   System.out.println("option 2 for phone");
   System.out.println("option 3 to show");
//    System.out.println("select a valid one");
   int ch=sc1.nextInt();
     switch(ch)
       {
         case 1: m.name();
         break;
         case 2: m.phone();
         break;
         case 3: m.show();
         default:
         System.out.println("enter a valid choice");
         break;
       }
       System.out.println("Press 1 to continue and 2 to exit");
       int n=sc1.nextInt();
       switch(n)
       {  case 1: System.out.println("continuing");
                    break;
       case 2:System.out.println("exiting");
                    return;
       default:System.out.println("enter a valid choice");
       break;
       }
   
}
}
}

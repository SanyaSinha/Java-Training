// import java.util.Scanner;
// class MenuDriven {
//     int a=30;
//     int b=20;
// public void add(){
//     System.out.println("addition is" +(a+b));
// }
// public void multiply(){
//      System.out.println("addition is" +(a*b));
// }

// public static void main(String args[]){
//     MenuDriven r= new MenuDriven();
//     Scanner sc=new Scanner(System.in);
//         while(true)
//         {
//     System.out.println("Press 1 for addition");
//     System.out.println("Press 2 for multiply");
//     int ch =sc.nextInt();
//     switch(ch){
//         case 1:
//            r.add();
//            break;
        
//         case 2:
    
//         r.multiply();
//         break;
    
//     default:
    
//         System.out.println("invalid");
//      break;

//     }
// }
// }
// }


import java.util.Scanner;

class MenuDriven {
    int a = 30;
    int b = 20;

    public void add() {
        System.out.println("Addition is " + (a + b));
    }

    public void multiply() {
        System.out.println("Multiplication is " + (a * b));
    }

    public static void main(String args[]) {
        MenuDriven r = new MenuDriven();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for multiplication");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    r.add();
                    return;    //if using break

                case 2:
                    r.multiply();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
//if we use break in place of return then it will continue to ask




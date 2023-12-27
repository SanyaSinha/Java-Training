// class ForEachArray {
//     public static void main(String args[]) {
//         int a[] = {2, 3, 45, 6, 7, 7, 6, 5645, 34};

//         System.out.println("Elements of array a:");
//         for (int item : a) {
//             System.out.print(item+ " "); // Prints each element separated by a space
//         }
//     }
// }
// import java.util.Scanner;
// class ForEachArray{
//     public static void main(String[] args) {
//         int b[] = new int[5];
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the items in b");
//         for(int item : b){
//             b[item]=sc.nextInt();                   // wrong way define a variable=0 separately and then increment it in b
//         }
//         System.out.println("Items are");
//          for(int item : b){
//             System.out.println(item+ "");
//          }
//     }
// }


import java.util.Scanner;
class ForEachArray{
    public static void main(String[] args) {
        int b[] = new int[5];
        int index=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the items in b");
        for(int item : b){
            b[index++]=sc.nextInt();               //a variable index=0 is incremented here      
                         }
        System.out.println("Items are");
         for(int item : b){
            System.out.println(item+ "");
         }
    }
}
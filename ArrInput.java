import java.util.Scanner;
public class ArrInput {
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the values");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       sc.close();
       System.out.println("Array is ");
       for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
    }
    
}

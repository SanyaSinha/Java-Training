import java.util.Scanner;

public class ArrayOne {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("enter array size");
         n=sc.nextInt();
        int a[] = {2, 3, 45, 6, 7, 7, 6, 5645, 34};
        int b[] = new int[n];
        
        System.out.println("Enter elements of b:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        System.out.println("Elements of b are:");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + b[i]);
        }
        System.out.println("\n");
        
        System.out.println("Elements of a are:");
        for (int j = 0; j < a.length; j++) {
            System.out.print("\t" + a[j]);
        }
    }
}


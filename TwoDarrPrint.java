import java.util.*;

public class TwoDarrPrint {
    public static void main(String args[]) {
        int arr[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Array is ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " "); // Use print() instead of println()
            }
            System.out.println(); // Move this line to print a new line after each row
        }
    }
}

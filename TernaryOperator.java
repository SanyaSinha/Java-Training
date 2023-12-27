import java.util.Scanner;

class TernaryOperator {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         n = sc.nextInt(); // Get input from the user and assign it to n
         sc.close();
        String result = (n % 2 == 0) ? "Even" : "Odd"; // Check if n is even or odd
        System.out.println("It is: " + result); // Print the result
    }
}

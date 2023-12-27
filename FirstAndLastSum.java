import java.util.Scanner;

class FirstAndLastSum {
    public static void main(String args[]){
        int n, firstDigit, lastDigit;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close();
        
        lastDigit = n % 10; // Extracting the last digit
        
        // Finding the first digit by continuously dividing the number until it becomes a single digit
        firstDigit = n;
        while(firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        
        int sum = firstDigit + lastDigit; // Calculating the sum
        System.out.println("Sum of first and last digits: " + sum);
    }
}


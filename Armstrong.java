import java.util.Scanner;

class Armstrong {
    public static void main(String[] args){
        int number,temp, sum = 0, rem;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number");
        number = sc.nextInt();
        temp = number; // Store the original number
        
        sc.close();
        
        while(number > 0){
            rem = number % 10;
            sum = sum + (rem * rem * rem);            //for three digit armstrong
            number = number / 10;
        }
        if(sum == temp){ // Compare with the original number
            System.out.println("Number is an Armstrong number");
        } else {
            System.out.println("Number is not an Armstrong number");
        }
    }
}

import java.util.Scanner;

 class ReturnMethodObject {
    int len;
    int width;

     int calculateArea() {
        return len * width;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ReturnMethodObject rectangle = new ReturnMethodObject(); // Create an instance

        System.out.println("Enter length:");
        rectangle.len = sc.nextInt();

        System.out.println("Enter width:");
        rectangle.width = sc.nextInt();

        int area = rectangle.calculateArea(); // Calculate area using the method

        System.out.println("Area is: " + area);

        sc.close(); // Close the scanner
    }
}

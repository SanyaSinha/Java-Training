import java.util.Scanner;

public class Calculator {
    int r, x, y;
    final float PI = 3.14f;
    Scanner sc = new Scanner(System.in);

    public void areaOfCircle() {
        System.out.println("Enter radius");
        r = sc.nextInt();
        float area = PI * r * r;
        System.out.println("Area is " + area);
    }

    public void circumferenceOfCircle() {
        System.out.println("Enter radius");
        r = sc.nextInt();
        float circum = PI * 2 * r;
        System.out.println("Circumference is " + circum);
    }

    public void areaOfRectangle() {
        System.out.println("Enter length");
        x = sc.nextInt();
        System.out.println("Enter width");
        y = sc.nextInt();
        int arearec = x * y;
        System.out.println("Area of rectangle is " + arearec);
    }

    public void volumeOfSphere() {
        System.out.println("Enter radius");
        r = sc.nextInt();
        float volsphere = 4 / 3f * (PI * r * r * r);
        System.out.println("Volume of sphere is " + volsphere);
    }

    public void surfaceAreaOfSphere() {
        System.out.println("Enter radius");
        r = sc.nextInt();
        float sursphere = 4 * PI * r * r;
        System.out.println("Surface area of sphere is " + sursphere);
    }

    public void areaOfSquare() {
        System.out.println("Enter side length");
        x = sc.nextInt();
        int areasq = x * x;
        System.out.println("Area of square is " + areasq);
    }

    public void areaOfRightAngleTriangle() {
        System.out.println("Enter base");
        x = sc.nextInt();
        System.out.println("Enter height");
        y = sc.nextInt();
        float areaoftri = 0.5f * x * y;
        System.out.println("Area of right angle triangle is " + areaoftri);
    }

    public void areaOfEquilateralTriangle() {
        System.out.println("Enter side length");
        x = sc.nextInt();
        float areaofeqtri = (float) ((Math.sqrt(3) / 4) * x * x);
        System.out.println("Area of equilateral triangle is " + areaofeqtri);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        try (Scanner sc2 = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter your choice");
                System.out.println("....................................");
                System.out.println("1. Area of Circle");
                System.out.println("2. Circumference of Circle");
                System.out.println("3. Area of Rectangle");
                System.out.println("4. Volume of Sphere");
                System.out.println("5. Surface Area of Sphere");
                System.out.println("6. Area of Square");
                System.out.println("7. Area of Right angle Triangle");
                System.out.println("8. Area of Equilateral Triangle");
                System.out.println("9. Exit");
                int ch = sc2.nextInt();

                switch (ch) {
                    case 1:
                        c.areaOfCircle();
                        break;
                    case 2:
                        c.circumferenceOfCircle();
                        break;
                    case 3:
                        c.areaOfRectangle();
                        break;
                    case 4:
                        c.volumeOfSphere();
                        break;
                    case 5:
                        c.surfaceAreaOfSphere();
                        break;
                    case 6:
                        c.areaOfSquare();
                        break;
                    case 7:
                        c.areaOfRightAngleTriangle();
                        break;
                    case 8:
                        c.areaOfEquilateralTriangle();
                        break;
                    case 9:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid input");
                        break;
                }

                // Ask if the user wants to continue
                System.out.println("Do you want to continue? (Y/N)");
                String continueChoice = sc2.next();
                if (!continueChoice.equalsIgnoreCase("Y")) {
                    System.out.println("Exiting...");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}

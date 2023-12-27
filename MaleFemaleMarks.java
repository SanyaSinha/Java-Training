import java.util.Scanner;

class MaleFemaleMarks {
    public void admission() {
        Scanner mar = new Scanner(System.in);

        System.out.println("Enter marks 1");
        int p1 = mar.nextInt();

        System.out.println("Enter marks 2");
        int p2 = mar.nextInt();

        System.out.println("Enter marks 3");
        int p3 = mar.nextInt();

        int total = p1 + p2 + p3;
        double per = (double) total / 3; // Calculate percentage with decimal point

        System.out.println("Enter gender f or m");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (per >= 82 && (ch == 'f' || ch == 'm')) { // Validate gender input
            System.out.println("Can take admission");
        } else {
            System.out.println("Cannot take admission");
        }
    }

    public static void main(String args[]) {
        MaleFemaleMarks m = new MaleFemaleMarks();
        m.admission();
    }
}

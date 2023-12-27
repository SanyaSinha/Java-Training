import java.util.Scanner;
class SwitchCase {
    public static void main(String args[]){
    System.out.println("enter the day number");
        Scanner sc=new Scanner(System.in);
        int dayNumber=sc.nextInt();
        sc.close();
        String day;
        switch(dayNumber){
            case 1:
            day = "Monday";
            break;
            case 2:
            day ="Tuesday";
            break;
            case 3:
            day = "Wednesday";
            break;
            case 4:
            day = "Thursday";
            break;
            case 5:
            day = "Friday";
            break;
            case 6:
            day = "Saturday";
            break;
            case 7:
            day = "Sunday";
            break;
            default:
            day ="invalid";
            break;
        }
System.out.println(day);

    }
    
}

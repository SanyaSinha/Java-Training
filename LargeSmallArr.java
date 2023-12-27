import java.util.Scanner;
public class LargeSmallArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] marks={3,2,1,7,5,4};
        int max=marks[0];
        int min=marks[0];
        sc.close();
        for(int num:marks)
        {
            if(num>max){
                max=num;
            }
        }
        for(int num:marks)
        {
            if(num<max){
                min=num;    
            }
        }

        System.out.println("Sum is " +(max+min));
    }
    
}

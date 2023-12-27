import java.util.Scanner;
public class ForEachloop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] marks={12,23,54,89,34,43};
        int max=marks[0];
        sc.close();
        for(int num:marks)
        {
            if(num>max){
                max=num;
            }
        }
        System.out.println("Highest score " +max);
    }
    
}

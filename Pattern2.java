import java.util.Scanner;
class Pattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        System.out.println("rows" +row);
        sc.close();
        for(char i=1;i<=row;i++)
        {    char ch = 'A';
            for(int j=1;j<=i;j++)            //everytime gets initialized by 1 then print astring upto i number of times once j becomes more than i then print next line
            {
                System.out.print(ch+" " );
                ch++;
            }

            System.out.println("  ");         //if not writing println then write print("\n")
        }

    }
    
}

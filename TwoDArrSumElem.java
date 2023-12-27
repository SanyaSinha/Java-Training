import java.util.*;
public class TwoDArrSumElem {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row");
    int row=sc.nextInt();
    System.out.println("Enter col");
    int col=sc.nextInt();
    System.out.println("Enter array");
    int arr[][]=new int[row][col];
    for(int i=0;i<row;i++)       //to take input
    {
        for(int j=0;j<col;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    sc.close();
  System.out.println("Array is");

    for(int i=0;i<row;i++)              //for printing
    {
        for(int j=0;j<col;j++)
        {
          System.out.print(arr[i][j] + "\t");
        }
          System.out.println();
    }
  }
}


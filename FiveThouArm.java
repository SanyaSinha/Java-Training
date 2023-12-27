// import java.util.Scanner;
class FiveThouArm {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        int temp,rem,count=0;
        double sum=0;
    //    System.out.println("enter the number"); 
    //    int num=sc.nextInt();
    //    sc.close();
    for(int num =0;num<5000;num++){
       temp=num;
       int tempnum=num;
       while(tempnum!=0)
       {
        tempnum=tempnum/10;
        count++;
       }
      num=temp;  //can reset n value using temp if you want
       while(num>0)
       {
         rem=num%10;                   //gives last digit
        sum+=Math.pow(rem,count);    //multiplies count times
        num=num/10;                        //removes last digit
       }
      if(sum==temp)
      {
      System.out.println("Armstrong: " +temp); 
      }
    }   
} 
}

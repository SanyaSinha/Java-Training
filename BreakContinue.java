// import java.util.Scanner;
// class BreakContinue {
//     public static void main(String args[]){
//         for(int i=1;i<=10;i++)
//         {
//             if(i==3 || i==8)    
//             continue;
//         System.out.println(i);

//         }
//     }
    
// }

class BreakContinue {
    public static void main(String args[]){
        int j=10;
        for(int i=1;i<j;i++,j--)
        {
            if(i==3)    
            continue;
        System.out.println(i+ "\t" +j);
        }
    }
    
}


public class RevTwoWays
{                                                            //reversal of four numbers
	public static void main(String[] args) {    
	    int a = 1234;              
	    int r = a%10;              //gives 4
	    int q = a/10;                              //gives 123
	    int t = q%10;            //gives 3
	    int s = q/10;                             //gives 12
	    int m = s%10;            //gives 2 
	    int n = s/10;                            //gives 1
		System.out.println("reversal of last digit is " +r+t+m+n);
	}
}
 //other way is use int rev = r*1000 + t*100 + m*10 + n*1 then print rev

 
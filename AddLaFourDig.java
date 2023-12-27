public class AddLaFourDig
{                                                            //addition of last four numbers
	public static void main(String[] args) {    
	    int a = 1234;              
	    int r = a%10;              //gives 4
	    int q = a/10;                              //gives 123
	    int t = q%10;            //gives 3
	    int s = q/10;                             //gives 12
	    int m = s%10;            //gives 2 
	    int n = s/10;                            //gives 1
		System.out.println("sum of last digit is " + (r+t+m+n));
	}
}

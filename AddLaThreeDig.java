public class AddLaThreeDig
{                                                            //addition of last three numbers
	public static void main(String[] args) {    
	    int a = 234;              
	    int r = a%10;              //gives 4
	    int q = a/10;                         //gives 23
	    int t = q%10;            //gives 3
	    int s = q/10;                          //gives 2
		System.out.println("sum of last digit is " + (r+t+s));
	}
}

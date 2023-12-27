public class PowerFour {
    public static void main(String args[]){
        int i = 256;
        
        // Check if log base 4 of i is an integer
        if (Math.log(i) / Math.log(4) % 1 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



// //ex: log64/log 4 =
// log64(base4) = 3*log4(base4) = 3
// now 3%1==0(rem)
// so it is power of 4

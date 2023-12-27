class TryCatchThreeMethod
 {
    public static void main(String args[]){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException a)
        {
         System.out.println(a.toString());
            System.out.println(a.getMessage());
               a.printStackTrace();                       // never put this in println
        }
    }
}




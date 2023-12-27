class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a =Integer.parseInt(args[0]);              //converts string args to interger type
            int b =Integer.parseInt(args[1]);
            //   int c= a/b;
              System.out.println(+(a+b));
        }

        catch(ArrayIndexOutOfBoundsException a)
        {
         System.out.println(+(5+6));
        }

        catch(NumberFormatException b)
        {
         System.out.println(+(8+2));
        }

        catch(ArithmeticException e)
        {
         System.out.println(+(11+22));
        }
    }
    
}

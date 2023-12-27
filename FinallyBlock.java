class FinallyBlock {
    public static void main(String[] args) {
        try
        {
            System.out.println("I am in try");
        }
        catch(ArithmeticException a)
        {
          System.out.println("I am in catch");
        }
        finally
        {
            System.out.println("I am in finally");
        }
                
        System.out.println("I am out of everything");
    }
    
}

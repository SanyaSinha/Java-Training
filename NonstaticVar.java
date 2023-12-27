public class NonstaticVar {
    int a=10;                       //else use static int a=10; then we dont have to make object for accessing a
    public static void main (String args[]){
        NonstaticVar hehe = new NonstaticVar();
        System.out.println(hehe.a);
    }
    
}

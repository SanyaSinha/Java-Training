// import java.util.Scanner;
class StringFunc {
    public static void main(String args[]){
        String s="SanYa"; 
        String p="SaNya";
        String a="SanYa";
        String q="SANYA";

        System.out.println(s.charAt(2));          //charAt()

        System.out.println(s.lastIndexOf('N'));   //missing so -1

        System.out.println(s.lastIndexOf('n'));   //gives 2

         System.out.println(s.startsWith("Ya"));  //false because never starts with substring Ya

         System.out.println(s.startsWith("San"));  //true because starts with substring san

         System.out.println(s.endsWith("San"));  //false as it starts with San

         System.out.println(s.endsWith("aN"));    //false as its a mid value

         System.out.println(s.endsWith("Ya"));    //true

         System.out.println(s.equals(p));       
         System.out.println(s.equals(a));
 
         System.out.println(s.equalsIgnoreCase(p));
           
         byte c[]=q.getBytes();
         for(int i=0;i<c.length;i++)
         {
          System.out.println(c[i]);       //prints hashcode(address) if we dont store q.getBytes in array
         }

        System.out.println(s.substring(3));
        System.out.println(s.substring(2,5));

          System.out.println(s.replace('Y','t'));

         System.out.println(s.toLowerCase());
         System.out.println(s.toUpperCase());

         System.out.println(s.trim());

     
    }
    
}

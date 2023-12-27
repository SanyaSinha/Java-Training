import java.util.ArrayList;
class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Hello");
        al.add(21);
        al.add("Khushi");
        al.add(474);
        al.add("Wow");
        al.add(2323);
        al.add("Sanya");
       System.out.println(al);
       al.remove(4);
       System.out.println(al);
       al.add("shivek");
       System.out.println(al);
       al.removeAll(al);
       System.out.println(al);
    //     al.add(3,"C");              //shows error because array is empty and we cannot directly add at 3rd index number
    //   System.out.println(al);
    }
}
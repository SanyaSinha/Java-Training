//HashSet Demo   :IT DOES NOT SORT LIKE TREE SET
import java.util.*;
class HashSetDemo{
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Z");
        h.add("A");
        h.add("Y");
        h.add("r");
        h.add("R");
        h.add("Q");
        h.add("L");
Iterator<String> itr = h.iterator();
while(itr.hasNext()){
    String str = itr.next();
    System.out.println(str);
}
System.out.println(h);

    }
}
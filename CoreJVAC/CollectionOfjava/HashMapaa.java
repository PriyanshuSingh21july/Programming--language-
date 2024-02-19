import java.util.HashMap;
import java.util.HashSet;

public class HashMapaa {

               public static void main(String[] args) {

                               // 1. unordered 
                       HashMap map = new HashMap<>();
                       map.put(4, "Priya");
                       map.put(2, "Shivam");
                       map.put(9, "Siddharth");
                       map.put(1, "Ram");
               
                       System.out.println("HashMap class map output is: "+map);




                       // logic 2
                       // not folling insertion order
                       HashSet st=new HashSet<>();
                       st.add(1);
                       st.add(10);
                       st.add(6);
                       st.add("Hello");
                       System.out.println(st);

               }
               
}

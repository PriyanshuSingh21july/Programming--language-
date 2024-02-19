import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetss {
               

               public static void main(String[] args) {

                              
                                  /*    Treeset logic 1 */
                              TreeMap map2 = new TreeMap<>();

                              /* 1. put method */
                       map2.put(4, "Priya");
                       map2.put(2, "Shivam");
                       map2.put(9, "Siddharth");
                       map2.put(1, "Ram");
                       map2.put(10, "Rama");
                       map2.put(5, "Sham");
                       map2.put(5, "Sham");
                       System.out.println("TreeMap class map output is: "+map2);



                       /*    Treeset logic 2 */


                       TreeSet tr=new TreeSet<>();
                       tr.add(10);
                       tr.add(1);
                       tr.add(10);
                       System.out.println(tr);



               }
}

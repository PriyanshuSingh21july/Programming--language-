import java.util.ArrayDeque;
import java.util.Deque;

public class Dequue {

             
               public static void main(String[] args) {
                             Deque<Integer>d=new ArrayDeque();
                              
                             d.addFirst(1);
                             d.addFirst(0);
                             d.addLast(3);
                             d.addLast(4);
                             System.out.println("Deque Insertion operation :"+d);


                             d.removeFirst();
                             d.removeLast();
                             System.out.println("Deque Deletion operation :"+d);



               
               
}
}
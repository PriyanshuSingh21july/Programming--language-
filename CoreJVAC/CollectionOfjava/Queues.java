import java.util.LinkedList;
import java.util.Queue;

public class Queues {
               

               public static void main(String[] args) {
                              
            Queue queue = new LinkedList<>();

            /* 1. Add() */
            queue.add(5);
            queue.add(9);
            queue.add(7);
            queue.add(23);
            System.out.println(queue);

            /* 2. remove() */
            queue.remove();
            System.out.println(queue);

            /* 3. */
            queue.isEmpty();
            System.out.println(queue);





               }
}

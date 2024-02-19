import java.util.Stack;

public class Stackss {
               

               public static void main(String[] args) {
                              

                              Stack stack = new Stack<Integer>();

                              /* 1. push()  */
                              stack.push(10);
                              stack.push(13);
                              stack.push(16);
                              stack.push(19);
                              System.out.println(stack);

                              /* 2. pop() */
                              stack.pop();
                              System.out.println(stack);


                              /* 3. peek() */
                              int element= (int) stack.peek();
                              System.out.println(element);
                               

                              /* 4. */
                              System.out.println(stack.isEmpty());

                               
                             


               }
}

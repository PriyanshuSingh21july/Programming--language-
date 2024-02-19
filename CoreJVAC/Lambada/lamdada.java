
import java.util.ArrayList;
import java.util.TreeSet;


               

               public class lamdada  {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);

    numbers.forEach( (n) -> { 
               System.out.println(n);
 } );


 TreeSet tr=new TreeSet<>();
 {
               tr.add(4);
               tr.add(4);
               tr.add(9);
               tr.add(2);
               tr.add(1);
               tr.forEach((n1)->
               System.out.print(n1+" ")
               );
              
 }


  }
}

/*
 * Lambda Expressions were added in Java 8.
A lambda expression is a short block of code which takes in parameters and returns a value.
 Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
 */
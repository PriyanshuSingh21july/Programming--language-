  import java.util.*;


class LinkedListFrame{
    public static void main(String[] args) 
    {

               // Logic 1
        LinkedList ll1=new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);

        System.out.println(ll1);

        
        System.out.println(ll1.get(1));

        System.out.println(ll1.indexOf(300));
        System.out.println(ll1.lastIndexOf(300));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());

        ll1.push(10);
        System.out.println(ll1);

        System.out.println(ll1.pop());


          // logic 2
         // order of insertion is preserved
         LinkedHashMap map1 = new LinkedHashMap<>();
         map1.put(4, "Priya");
         map1.put(2, "Shivam");
         map1.put(9, "Siddharth");
         map1.put(1, "Ram");
 
         System.out.println("LinkedHashMap class map output is: "+map1);
       

        


        

        
    }
    
}

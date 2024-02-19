public class private_three {

              private int a=10;
              private int b=30;
  

            /* inside class acess */
           public void hello()
               {
                        System.out.println(a);     
                        System.out.println(b);
                             
               }

               public static void main(String[] args) {
                              private_three p1=new private_three();
                             p1.hello();

 
               }
               
}

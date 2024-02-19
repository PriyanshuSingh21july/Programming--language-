public class public_Two {

          
           public     int b=6;
           public     int c=10;
       
           /* inside class acess */
public void hello()
  {

                
              System.out.println(b);             

  }

  public static void main(String[] args) {

               public_Two p1=new public_Two();
               p1.hello(); 


               /* outside package acess */
               System.out.println(p1.c );
  }
  
}


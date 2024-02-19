package FINAL;
 final class Finalclass {

               void hello()
               {
                              System.out.println("Priyanshu Singh");
               }

/* 
  once you declare class final then any ohter class inherit  property of that class

 class InnerFinalclass extends Finalclass {

                  void hii()
                  {
                              System.out.println("Priyanshu Kumar Singh"); 
                  }
             
                  */

               public static void main(String[] args) {
                              
                              //single inheritance
                           /*  InnerFinalclass f1=new InnerFinalclass(); */
                           Finalclass f1=new Finalclass();
                              f1.hello();
                           /*   f1.hii();  */

               }
}



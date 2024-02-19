public class LogicalOperator {

               public static void main(String[] args) {
                              

                              System.out.println("************* Logical operator (&& || !)");

                              /* 1. &&  if both condition true then if block execute*/
                              int a=40;
                              int b=30;
                              int c=45;
                              if(a>b && a>c)
                              System.out.println("A is greater");
                              else
                              System.out.println("Not greater");

                              
                                             
                              /* 2. || if both condition  at least one condition true then if block execute  */

                              if(a>b || a>c)
                              System.out.println("A is greater than b");
                              else
                              System.out.println(" b is greater");














               }
               
}

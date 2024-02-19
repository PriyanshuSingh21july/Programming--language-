package CONTROLSTATEMENT;

public class Return {
               



               void demofunction(double j)
               {
                   if (j < 9)
            
                      
                       return;
                   ++j;
               }
            
               
               public static void main(String[] args)
               {
                              Return  gfg = new  Return ();
                   // Calling above method declared in above class
                   gfg.demofunction(5.5);
            
                  
                   System.out.println("Program executed successfully");
               }
}

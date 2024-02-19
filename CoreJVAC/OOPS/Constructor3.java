import java.util.Scanner;

public class Constructor3 {

               int result;
               Constructor3(int a,int b)
               {

             result=a+b;
            
               }
               public void  show() {
               
                               System.out.println("Add :"+result);

               }
               
               public static void main(String[] args) {
                              Constructor3 obj=new Constructor3(10,30 );
                              obj.show();
                                 Constructor3 obj2=obj;
                                 obj2.show();
                              
               }
}

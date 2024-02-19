import java.util.Scanner;

/**
 * ClassObject
 */
public class ClassObject {
 
               int a,b,c;

               void input()
               {
                              Scanner sc=new Scanner(System.in);

                              System.out.println("Entter value of a");
                              a=sc.nextInt();
                              System.out.println("Entter value of b");
                              b=sc.nextInt();
                              
                              int c=a+b;
                              System.out.println("Output :"+c);
               }
               

             
               public static void main(String[] args) {
                              
                              ClassObject cs=new ClassObject();
                              cs.input();
                             // cs.result();
               }
}
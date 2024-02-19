import java.util.Scanner;

public class Constructor1 {
               
               int a;
               int b;
               int c;

               Constructor1()
               {
                   Scanner sc=new Scanner(System.in);
              System.out.println("ENter value of a:");
              a=sc.nextInt();
               System.out.println("ENter value of b:");
              b=sc.nextInt();
               int result=a+b;
             System.out.println("Add :"+result);      
               }

               public static void main(String[] args) {
                              Constructor1 obj=new Constructor1();
                              
               }
}
/* Default constructor */
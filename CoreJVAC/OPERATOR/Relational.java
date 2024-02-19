import java.util.Scanner;

public class Relational {

               public static void main(String[] args) {
                              

                               /*  == , != , > , < , >= , <= , */

                              Scanner sc=new Scanner(System.in);

                              System.out.println("Enter value of A:");
                              int a=sc.nextInt();
                               System.out.println("Enter value of B:");
                              int b=sc.nextInt();
                               System.out.println("Enter value of C:");
                              int c=sc.nextInt();

                              if (a>b && a>c) {
                                             System.out.println("A is greater");
                                             
                              }
                               if (b>a && b>c) {
                                             System.out.println("B is greater");
                                             
                              }
                              
                                if (c>a && c>b)
                              {
                                             System.out.println("C is greater");
                              }

               }
               
}

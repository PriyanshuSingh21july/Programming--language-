import java.util.Scanner;

public class   Encapsulation {
               
 
           private  int a,b,result; // data hiding
               void Addition()
               {
                              Scanner sc=new Scanner(System.in);

                              System.out.println("Enter value of a:");
                              a=sc.nextInt();
                              System.out.println("Enter value of a:");
                              b=sc.nextInt();

               }
               void Calculate()
               {
                              result=a+b;

               }
               void show()
               {
                              System.out.println("Addition :"+result);
               }
 public static void main(String[] args) {

               Encapsulation   es=new Encapsulation();
               es.Addition();
               es.Calculate();
               es.show();
               
 }

}



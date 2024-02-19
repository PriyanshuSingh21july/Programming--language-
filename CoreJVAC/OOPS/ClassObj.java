import java.util.Scanner;

public class ClassObj {
            int a;
            int b;
             int result;
            public void input()
            {

              Scanner sc=new Scanner(System.in);
              System.out.println("ENter value of a:");
              a=sc.nextInt();
               System.out.println("ENter value of b:");
              b=sc.nextInt();
               
        
            }

            public void add()
            {
          result=a+b;
             System.out.println("Add :"+result);

            }


            // main class
               public static void main(String[] args)
                {
                           
                              ClassObj obj=new ClassObj();
                              obj.input();
                              obj.add();;
               }
               
}

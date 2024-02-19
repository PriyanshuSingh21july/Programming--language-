import java.util.Scanner;

public class InputOneD {
               

              
               public static void main(String[] args) {
                              Scanner sc=new Scanner(System.in);

                              System.out.println("Enter size of arry");
                              int n=sc.nextInt();
                              
                              System.out.println("Enter arry elemet of arry ->");
                              int arr[]=new int[n];

                              for(int i=0; i<n; i++)
                              {
                                             arr[i]=sc.nextInt();
                              }
                              

                              for(int i=0; i<n; i++)
                              {
                                             System.out.println(arr[i]);
                              }

               }
}

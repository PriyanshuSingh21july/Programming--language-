package DSA;

import java.util.Scanner;

public class SqureRoot {

               public static int FindsqureRoot(int x)
               {
                              int low=0;
                              int high=x;
                              int result=-1;

                              while (low<=high)
                               {
                                             
                              int mid=(low+high)/2;
                              long val=mid*mid;

                              if (val==x) {
                                return mid;
                                             
                              }
                              else if (val<x) {
                                               result=mid;
                                             low=mid+1;
                                             
                              }
                              else  {
                                           
                                             high=mid-1;
                                             
                              }
                    

               }
                              return result;
               }

               public static void main(String[] args) {
                            
                              Scanner sc=new Scanner(System.in);

                              System.out.println("Enter Element to find squre root");
                              int x=sc.nextInt();

                              /*Function calling  */
                               int result=FindsqureRoot(x);
                               System.out.println("Squre root is :"+result);



               }
               
}

package DSA;

import java.util.Scanner;

public class Linearsort {

               public static void main(String[] args) {
                              
               Scanner sc=new Scanner(System.in);

              /*  1.     Size of arry           */ 
               System.out.println("Enter arry element size ->");
               int n=sc.nextInt();


              /* 2. Arry element enter */
               System.out.println("Enter arry elemet of arry ->");
               int arr[]=new int[n];
                for(int i=0;i<n;i++)
                {
                arr[i]=sc.nextInt();
                }


                /* 3.  Input taeget element of arry serach */
                System.out.println("Enter target element ->");
                int target=sc.nextInt();


                /* 4. Logic of code  */

   
                 for (int i=0; i<n; i++)
                   {
                     if(arr[i]==target)
                     {
                         System.out.println("Element found ->"+i);
                         
                         }
                     }
               }
}







//1. Time complexity :o(n)
// Space complexity :o(n)

/* 2. Advantage
 .simple
 .useful for sotted or unsorted arry
 .No required extra space
 */
 
 /* 3. Disadvantage
 . more time taken when size of arry big 


  */
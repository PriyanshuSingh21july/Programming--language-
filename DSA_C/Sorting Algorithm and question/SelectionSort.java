package DSA;

import java.util.Arrays;

public class SelectionSort {

               /* Logic/Approach of program */
               public static void  selectionSort(int arr[])
               {
                              for(int i=0;i<arr.length;i++)
                              {
                                             int min_indx=i;
                                             for(int j=i+1;j<arr.length;j++)
                                             {
                                                            if (arr[j]<arr[min_indx])
                                                             {
                                                                           min_indx=j;
                                                                           
                                                            }
                                             }
                                             if (min_indx!=i) {
                                                            int temp=arr[i];
                                                            arr[i]=arr[min_indx];
                                                            arr[min_indx]=temp;
                                                            
                                             }
                              }

               }


               public static void main(String[] args) {
                              int arr[]={4,1,3,7,9,12,11,45};

                              /* Function calling  */
                              selectionSort(arr);
                              System.out.println("Sorted element ->");
                              System.out.println(Arrays.toString(arr));
                              
               }
               
}


/*

 * Time complixity : o(n^2) 
 * Space Complixity : o(1)
 * Single swap in insertion sort

 */
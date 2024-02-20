package DSA;

import java.util.Arrays;

public class InsertionSort {

               public static  void InsertionSorts (int arr[])
               {
                              for(int i=1;i<arr.length;i++)
                              {
                                             int j=i;
                                             while (j>0 && arr[j]<arr[j-1]) 
                                             {
                                                            int temp=arr[j];
                                                            arr[j]=arr[j-1];
                                                            arr[j-1]=temp;
                                                            j--;
                                                            
                                             }


                              }
               }
               




               public static void main(String[] args) {
                              int arr[]={3 ,7,4,9,12,45,67,56};
                              InsertionSorts(arr);
                              System.out.println("Sorted element:");
                              System.out.println(Arrays.toString(arr));
               }
}


// Approach: insertion sort
// Time complexity : o(n2)
//  Time commplixity :o(n)
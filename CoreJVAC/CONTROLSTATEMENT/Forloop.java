package CONTROLSTATEMENT;

public class Forloop {

               public static void main(String[] args) {
                              
                              int arr[]={1,2,3,4,5,6,7,8,9,10};

                              int n=arr.length;
                              int sum=0;

                              for(int i=0; i<n; i++)
                              {
                                             sum+=arr[i];

                              }
                              System.out.println("Sum of arry :"+sum);
               }

               
}

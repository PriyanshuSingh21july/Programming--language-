package DSA;

import java.util.Scanner;



public class BinarySearch {

 /* Logic of code  */
    public  static int binarySearchss(int arr[],int target) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + high;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


        return 0;
    }


        public static void main(String[] args) {
        int indx=-1;

            Scanner sc=new Scanner(System.in);

            /* 1.   Taken size of arry  */
            System.out.println("Enter size of arry");
            int n=sc.nextInt();

            int arr[]=new int[n];

            /*  2.  Enter arry element */
            System.out.println("Enetr Sorted arry element :");
            for(int i=0; i<n; i++)
            {
                arr[i]= sc.nextInt();
            }

            /* 3. Enter target element */
            System.out.println("Enter thr target :");
            int target=sc.nextInt();

            /* 4. Function calling */
            int result=binarySearchss(arr,target);

            if(result == 0){
                System.out.println("Searched element is not found in an array");
            }
            else{
                System.out.println("Searched element is found at the location:" +result);
            }


        }
    }


    /*        
     * 1. Time complexity : o(logn)
     
     * 2. Space complexity : o(1)
     
     * 3. Advantage -> 
     * It is based on the divide and conquer approach.
     * Used of huge data set
     
     * 4.Disadvatage -> 
     * use for sorted data
     */
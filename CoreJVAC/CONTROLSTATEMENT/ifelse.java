package CONTROLSTATEMENT;

import java.util.Scanner;

public class ifelse {
               public static void main(String[] args) {
               

               Scanner sc=new Scanner(System.in);

               System.out.println("Enter any number :");
               int age=sc.nextInt();

               if (age>18) {
                              System.out.println("Eligible for voting");
                              
               }
               else
               {
                              System.out.println("Not eligible for voting");
               }
  }
               
}

public class Multilevelinh {


               

                 public void add()
                 {
                 int x,y=30,z=10;
                 x=y+z;
                 System.out.println("Add="+x);
                 }  
               }

               //extending Addition
               class Subtraction extends  Multilevelinh
               {
                void sub()
                 {
                 int x,y=30,z=10;
                 x=y-z;
                 System.out.println("Sub="+x);
                 }  
               }

               //extending Subtraction
               class Multiplication extends Subtraction
               {
                void multi()
                 {
                 int x,y=30,z=10;
                 x=y*z;
                 System.out.println("Multiply="+x);
                 }  
               }
               
               class Easy
               {
                public static void main(String[] args)
                {
                 //Creating instance(object)
                 Multiplication obj=new Multiplication();
                 obj.add();
                 obj.sub();
                 obj.multi();
                }
               }
class thiss
{
               /* instance variable */
               int i;
               void input(int i /* Local variable  */)
               {
                              this.i=i;
               }
               void show()
               {
                              System.out.println("Value is :"+i);
               }

         public static void main(String[] args) {
               thiss s=new thiss();
               s.input(10);
               s.show();
         }
}

/* This keyword is a refernce variable that refer current object  if we make same variable instace and local variavle still
 using this keyword can acess intance variable
*/
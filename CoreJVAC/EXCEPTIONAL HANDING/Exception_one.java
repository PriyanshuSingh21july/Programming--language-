public class Exception_one {

               public static void main(String[] args) {
                              

                              int a=10;
                              int b=0;
                              int ans;

                              int num1=10;
                              int num2=12;
                              int result;


                              try{
                                             result=num1+num2;
                                             System.out.println(result);


                              }
                              catch(Exception e)
                              {
                              System.out.println("Something Went wrong");
                              }


                              /* exception */
                          try{
                              ans=a/b;
                              System.out.println(ans);
                          }
                          catch(Exception e)
                          {
                              System.out.println("Wrong"+e);
                          }


                          /* Arry exeception */
                          int arr[]={1,2,3,4,5,6};
                          try{
                              System.out.println(arr[7]);
                          }
                          catch(Exception e)
                          {
                              System.out.println("Stay in your limit"+e);
                          }

                        

               }
               
}

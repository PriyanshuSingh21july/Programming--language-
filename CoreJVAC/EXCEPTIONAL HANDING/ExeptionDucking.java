class A{


               public void a() throws Exception
               {
                              b();

                          /* 
                              try{
                                             b();
                                            
                                             }
                                             catch(Exception e)
                                             {
                                                            System.out.println("Something wrong"+e.getMessage());
                                             }
                            */

               }

               public void b()
               {
                              int num1=10;
                              int num2=0;

                              /* 
                              try{
                              int result=num1/num2;
                              }
                              catch(Exception e)
                              {
                                             System.out.println("Something wrong"+e.getMessage());
                              }
                              */

               }
}




class ExeptionDucking

{
               public static void main(String[] args) 
               {
                              A a1=new A();

                              try
                              {
                              a1.a();
                              }
                              catch(Exception e)
                              {
                                             System.out.println("Something wrong"+e.getMessage());
                              }

                              
               }
}

/*
 * throws Exception: use to exception ducking it means avoid/ignore our error
 */
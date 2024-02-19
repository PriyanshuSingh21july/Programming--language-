package StaticKeyord;

public class StaticsBlock {
               
      

        static
        {
               System.out.println("I am static block ");
        }
        void hello()
        {
               System.out.println("Instance Block");
        }

               public static void main(String[] args) {
                              StaticsBlock st=new StaticsBlock();
                              st.hello();
                  System.out.println("I am main Block");

               }
}

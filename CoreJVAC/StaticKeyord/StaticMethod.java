package StaticKeyord;

public class StaticMethod {
               
               static void show()
               {
                              System.out.println("Static method");

               }


               public static void main(String[] args) {

                              // we no need to make object for calling static method we just call using class name
                              StaticMethod.show();
                              /*ststic method use for memeory management because there is no need to create object abd we already
                              that if we will create object then it occupes some space in memory */
               }
}

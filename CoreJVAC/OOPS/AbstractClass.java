abstract  class AbstractClass {

               
               void hello()
               {
                              System.out.println("Priyanshu");
               }
               
}
 class InnerAbstractClass  extends AbstractClass{
               void hii()
               {
                              System.out.println("Vivek");
               }
 

               public static void main(String[] args) {
                          AbstractClass s1=new InnerAbstractClass();
                          s1.hello();

                          InnerAbstractClass s2=new InnerAbstractClass();
                          s2.hii();
                             



               }

               }

/*We can't  create object of abstract class but make reference of abstract class */
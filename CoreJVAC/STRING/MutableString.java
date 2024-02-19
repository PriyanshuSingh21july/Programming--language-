public class MutableString {

               public static void main(String[] args) {

                             

                               /* Mutable String */
                               /*StringBuilter */
                               StringBuilder str2=new StringBuilder("Vivek");
                               System.out.println(str2);
                               str2.append(" Singh");
                               System.out.println(str2);
                               System.out.println("Lenght of String :"+str2.length());


                                /* StringBuffer*/
                               StringBuffer st1=new StringBuffer("Priyanshu");
                               st1.append("Singh");
                               System.out.println(st1);

                              /* Another way create string */
                       String str1=new String("PwSkill");
                          System.out.println(str1);
               }
               
}
/* create objecr in heap in constant pool memory */
public class MethodString {
               public static void main(String[] args) {

        
                              String str="Priyanshu singh";
                              String s1="   Vivek ";
                                  System.out.println(str);
                  
                   /* 1.  Upper case */
                   System.out.println("Upper case :"+str.toUpperCase());
               
               /* 2. Lowercase */
                     System.out.println("Lower case :"+str.toLowerCase());

                     /* 3.  Lenght */
                     System.out.println("Length of string:"+str.length());

                     /* 4. CharAt  */
                     System.out.println("Acess elemnt :"+str.charAt(0));

                     /* 5. Endwith */
                     System.out.println("Endwith element :"+str.endsWith("anshu"));

                     /* 6.Equal check */
                     System.out.println("Equal strig :"+str.equals("Priyanshu"));

                     /* 7. Replace replaceall */
                     System.out.println("Replace string :"+str.replace("Priyanshu","vivek"));
                     
                     /* 8.trim */
                     System.out.println("Trim :"+s1.trim());
}
}

import java.util.Scanner;

public class SetterGetter {

                      String name;
                        int rollno;

              
                              void input()
                              {
                                             Scanner sc=new Scanner(System.in);

                                             System.out.println("Enter name");
                                               name=sc.nextLine();

                                             System.out.println("Enter Rollno");
                                             rollno=sc.nextInt();
                              }
                              void show()
                              {
                                           
                                             System.out.println("Name is :"+name);
                                             System.out.println("Roll no :"+rollno);
                              }


               
               
             
               public static void main(String[] args) {
                              SetterGetter st=new SetterGetter();
                          
                                 st.input();
                                 st.show();
               }
}

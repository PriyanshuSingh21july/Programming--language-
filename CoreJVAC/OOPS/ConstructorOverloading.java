public class ConstructorOverloading {
 
private String name;
private int age;
private float mark;



               ConstructorOverloading()
               {
                              name="Priyanshu";
                              age=20;
               
               }

               ConstructorOverloading(String name,int age,float mark)
               {
                              this.name=name;
                              this.age=age;
                              this.mark=mark;

               }

               ConstructorOverloading(String name,int age)
               {
                              this.name=name;
                              this.age=age;
               }




               public void show()
               {
                              System.out.println(name);
                              System.out.println(age);
               }
               
               public static void main(String[] args) {
                              

                              ConstructorOverloading cs=new ConstructorOverloading();
                              cs.show();
                          

                            
                              ConstructorOverloading cs1=new ConstructorOverloading("Vivek",19);
                              cs1.show();


                              ConstructorOverloading cs2=new ConstructorOverloading("Vivek Singh",21);
                              cs2.show();
                          

               }
}

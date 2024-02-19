package FINAL;

class Animal{


    final void sleep()
    {
       int age=20;
        System.out.println("Animal is sleeping"+" "+age);
    }
}

        
class Tiger1 extends  Animal
{
    // void sleep()final method we cannot ovverride in child class
    // {

    // }
}

public class  FinalMethod 
{
    public static void main(String[] args) 
    {

        Tiger1 t=new Tiger1();
        t.sleep();
    }
    
}
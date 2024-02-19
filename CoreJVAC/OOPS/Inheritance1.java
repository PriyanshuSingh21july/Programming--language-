// Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class
class One {
	public void print_geek()
	{
		System.out.println("Geeks");
                              int a=10;
                              int b=20;
                              int c=a+b;
                              System.out.println("Add:"+c);
                             
                              
	}
}

class Two extends One {
	public void print_for() { System.out.println("for");


               Scanner sc=new Scanner(System.in);


              
}
}

// Driver class
public class Inheritance1 {
	// Main function
	public static void main(String[] args)
	{
		Two g = new Two();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}


// Single inheritance
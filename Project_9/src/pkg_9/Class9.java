package pkg_9;

public class Class9 
{
int a, b;
public void display1() // method 1
{
	System.out.println("This is method 1");
}
public void display2() // method 2
{
	System.out.println("This is method 2");
}
public Class9() // constructor 1
{
	System.out.println("This is default constructor");
}
public Class9(int x) // constructor 2
{
	this();
	System.out.println("This is one parametrized constructor");
}
public static void main(String[] args) 
{
	Class9 abc=new Class9(44);
	abc.a=100;
	abc.b=200;
	System.out.println("First integer" +abc.a);
	System.out.println("Second integer" +abc.b);
	abc.display1();
	abc.display2();
}
}

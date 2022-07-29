package Abstractiondemo;

abstract class A
{
	abstract void display();
	public void demo()
	{
		System.out.println(("abstract class"));
	}
}
interface in
{
	void add(int a, int b);
	
}
class child extends A implements in
{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display() {
		System.out.println("display");
		
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		child c=new child();
		c.add(10, 20);
		c.demo();
		c.display();
		

	}
}

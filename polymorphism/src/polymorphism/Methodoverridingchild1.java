package polymorphism;

public class Methodoverridingchild1 extends Methodoverridding {
	public void method1()
	{
		System.out.println("World");
	}

	public static void main(String[] args) {
		Methodoverridingchild1 obj=new Methodoverridingchild1();
		obj.method1();
		Methodoverridding obj1=new Methodoverridding();
		obj1.method1();

	}

}

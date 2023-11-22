package polymorphism;

public class Methodoverloading {
	public void method1()
	{
		System.out.println("Hello");
	}
	public int method1(int a)
	{
		return a;
	}
	public static void main(String[] args) {
		Methodoverloading obj=new Methodoverloading();
		obj.method1();
		System.out.println(obj.method1(5));
		}

}

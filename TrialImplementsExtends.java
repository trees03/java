interface Ax
{
	public void method1();
	public void method2();
}
class Bx implements Ax
{
	public void method1()
	{
		System.out.println("Hello method 1");
	}
	public void method2()
	{
		System.out.println("Hello method 2");
	}
}
abstract class Cx extends Bx
{
	abstract public void method3();
}
class Dx extends Cx
{
	public void method3()
	{
		System.out.println("Hello method 3");
	}
}
public class TrialImplementsExtends {
	public static void main(String args[]) {
		Cx obj3=new Dx();
		obj3.method1();
		obj3.method2();
		obj3.method3();
	}

}

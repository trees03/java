import java.lang.System;
class DivideByZero extends ArithmeticException
{
	public DivideByZero(String msg)
	{
		super(msg);
	}
}
public class OwnException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			double x=5;
			double y=0;
			double z=x/y;
			throw new ArithmeticException("New Arithmetic Exception");
			
		}
		catch(DivideByZero e)
		{
			System.out.println(e.getMessage());
		}
	}

}

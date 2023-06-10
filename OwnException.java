import java.lang.Exception;
import java.lang.System;
class MyException extends Exception
{
	public MyException(String message)
	{
		super(message);
	}
}
public class OwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String customerId=null;
			if(customerId==null)
				throw new MyException("Customer id cannot be null");
		}
		catch(MyException e)
		{
			System.err.print(e);
		}
		System.out.println("\nProgram ended swiftly");
		
	}

}

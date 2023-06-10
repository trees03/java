import java.util.*;
public class Tcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int z=0;

		try
		{
			int y=sc.nextInt();
			z=x/y;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 is not allowed");
		}
		finally
		{
			System.out.println("Executed besides exception");
		}
		System.out.println("Output ="+z);
		System.out.println("End");
	}

}


public class prime
{

	public static void main(String[] args)
	{
		for(int i=22; i<=42;i++) 
		{
			for(int j=2;j<=i;j++) 
			{
				if(i%j==0)
				{
					System.out.println(i+" is not a prime number");
					break;
				}
			}
		}
	}

}

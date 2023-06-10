import java.io.*;

public class CheckedException {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileInputStream fis=null;
		int k;
		try {
		fis=new FileInputStream("F:/First.java");
		}
		catch(FileNotFoundException e1)
		{
			System.out.println("File cant be found");
		}
		finally
		{
			System.out.println("I am executable");
		}
		try{
			while((k=fis.read())!=-1)
		
				{
			System.out.println((k));
				}
		}
		catch(IOException e)
		{
			System.out.println("File io isnt found");
		}
		fis.close();
		
		
	}

}

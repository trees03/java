//can be static or not
//take collection as parameter
//mention type parameter before the return type
//printf for formated output
public class GMethod 
	{
		public static <E> void print(E[] inpA)//generic method
		{
			for(E element : inpA)//for each element of any type of inputarray
			//element is just a variable replace it with any variable
			{
				System.out.print(element+" ");
			}
			System.out.println();
		}
	

	public static void main(String[] args) {
		Integer[] intArray= {1,4,6,89};
		print(intArray);
		String[] sArray= {"hi","hello"};
		print(sArray);
	}

}

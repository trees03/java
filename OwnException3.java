import java.util.*;
public class OwnException3 {
	int m;
	public void getMarks(int marks)
	{
		if (marks<0||marks>100)
		{
			throw new IllegalArgumentException("Something went wrong");
		}
		else
			m=marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		OwnException3 e=new OwnException3();
		e.getMarks(marks);
		System.out.println(e.m);

	}

}

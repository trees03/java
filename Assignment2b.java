/* Assignment-2
2. demonstrate the aggregation concept.
in the diagram we have class circle with attributes double pi and a method area(int radius)
it also has a class operation with method square(int n). this is aggregation , when two 
classes have a "has a " connection between them.
  */
 
import java.io.*;
class Operation{
	
	public int square(int n) {
		return n*n;
	}
}
class Circle
{
	 Operation op;
	
	
	double pi=3.14;
	public double area(int radius) {
		op=new Operation();
		int r=op.square(radius);
		return pi*r;
	}
}
	
	
	public class Assignment2b{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleX obj=new CircleX();
		System.out.println("The result is: "+obj.area(3));
	}
	}


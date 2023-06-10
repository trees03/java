package dsa;
//nCr=n!/r!*(n-r)!
//recursion
import java.util.*;
public class combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the subset number");
		int r=sc.nextInt();
		System.out.println("The number of combinations are: "
		+ (factorial(n)/(factorial(r)*factorial(n-r))));
		
	}
	static int factorial(int n) {
		int fact=1;
		for(int i=n;i>1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}

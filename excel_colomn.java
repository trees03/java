package dsa;
import java.util.*;
public class excel_colomn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the colomn value");
		String c=sc.next(); 
		c=c.toUpperCase();
		//char 
		if(c.length()==1) {
		System.out.println(c.charAt(0)-'A'+1);
		}
		else {
			System.out.println(26+(c.charAt(1)-'A'+1));
		}

	}

}

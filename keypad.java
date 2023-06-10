package dsa;
import java.util.*;
public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int td=1;
		int d=0;
		int temp=n;
		
		
		String[][] arr={{},{},{"A","B","C"},{"D","E","F"},{"G","H","I"},
				{"J","K","L"},{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
		
		while(n!=0) {
			d=n%10;
			td=td*arr[d].length;
			n=n/10;

		}
		System.out.println("There will be " +td+ " combinations ");
		String[] farr=new String[td];
		
		


}
}

package dsa;
import java.util.Scanner;
public class wave_print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the number of colomns:");
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int a=0;a<n;a++) {
			for(int b=0;b<m;b++) {
				System.out.println("Enter the values of the array");
				arr[a][b]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.println(arr[j][i]);
				}
			}
			else {
				for(int j=(n-1);j>=0;j--) {
					System.out.println(arr[j][i]);
				}
			}
		}

	}

}

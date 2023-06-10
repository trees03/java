package advjava;
import java.util.Scanner;
import java.io.Console;
import java.io.*;
public class practical_first {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Hello world");
		System.out.println("Input using Scanner class: ");
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println("Input using Console class");
		Console c=System.console();

		String n=c.readLine();
		System.out.println(n);
		System.out.println("Input using InputStreamReader and BufferedReader Class:");
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String l=br.readLine();

		
		System.out.println(l);
		

		
		

	}

}

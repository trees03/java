import java.util.Scanner;
import java.util.Random;
class Assignment3 
{	
	Scanner sc = new Scanner(System.in);
	String it[] = new String[] {"Pasta","Idli and chutney","Paratha and egg curry","Masala Dosa", "Burger", "Pancakes", "Pizza","Tacos","Burritos", "Hotdog" };
	String it2[] = new String[9];
	int arr[] = new int[4], f =1;
	int c[] = new int[10]; //Stores choice of ten members
	Assignment3()
	{
		for(int i=0;i<4;i++)
			arr[i] = 0;
	}
	void dishselecter()
	{   
		int x, i,j,k;		//Selects 4 random dishes from the list.
		Random rg=new Random();
		String[] pa = new String[it.length]; 
		pa = it;
		for (j = 0; j < 6; j++) 
		{
			x = rg.nextInt(10) + 1;
			for (i = 0, k = 0; i< pa.length; i++) // copy all the elements in the original to item2 except the one at index 
			{ 
				if (i == x) // check if index is crossed, continue without copying 
					continue; // else copy the element
				it2[k++] = pa[i]; 
			} 
			pa = it2;
		}
	} 
	int app(int x)
	{
		System.out.println("***Welcome to the Daily Dish App.***");
		System.out.println("Please select a dish : \n 1. "+it2[0]+ " \n 2. "+it2[1]+" \n 3. "+it2[2]+" \n 4. "+it2[3]);
		int ch = sc.nextInt();
		c[x] = ch;
		if(ch == 1)
			arr[0]+=1;
		else if(ch == 2)
			arr[1]+=1;
		else if(ch == 3)
			arr[2]+=1;
		else if(ch == 4)
			arr[3]+=1;
		else
		{
			System.out.println("Invalid input.");
			f=0;
		}
		System.out.println();
		return f;
	}
	public static void main(String args[])
	{
		Assignment3 da = new Assignment3();
		da.dishselecter();
		int i,cr=0;
		for(i = 0; i<10;i++)
		{
			System.out.println("Member "+i+" : ");
			da.f = da.app(i);
			if(da.f!=1)
				--i;
			System.out.println();
			da.f=1;
		}
		int max = da.arr[0];
		int max2=0;
		for(i = 1; i < 4; i++)
		{
			if(max < da.arr[i])
				max2 = da.arr[i];
			if(max==da.arr[i])
				++cr;
		}
		if(cr==3)
		{
			int mi = 0;  //Generating random dish as all dishes have equal vote.
			int ma = 3;   
			max2 = (int)(Math.random()*(ma-mi+1)+mi);  
		}
		System.out.println("Choice of each member is as follows - ");
		for(i=0;i<10;i++) 
			System.out.println("Member "+(i+1)+" = "+da.c[i]);
		System.out.println();
		System.out.println(">>>>>>> Votes for each dish : <<<<<<<");
		System.out.println("1. "+da.it2[0]+": "+da.arr[0]);
		System.out.println("2. "+da.it2[1]+": "+da.arr[1]);
		System.out.println("3. "+da.it2[2]+": "+da.arr[2]);
		System.out.println("4. "+da.it2[3]+": "+da.arr[3]);
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("Dish to be prepared for meal : "+da.it2[max2]);
	}
}

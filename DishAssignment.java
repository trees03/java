
// package javab11;
 import java.util.Scanner;

 class Mother{
 	void enterDish() //here the mom will enter the names of the dishes
 	{
 		Scanner sc = new Scanner(System.in);
 			System.out.println("Enter first dish");
 			String D1 = sc.nextLine();
 			System.out.println("Enter second dish");
 			String D2 = sc.nextLine();
 			System.out.println("Enter third dish");
 			String D3 = sc.nextLine();
 			System.out.println("Enter fourth dish");
 			String D4 = sc.nextLine();
 			System.out.println("The available food items are: "+"\n 1."+D1+"\n 2."+D2+"\n 3."+D3+"\n 4."+D4);
 		}
 	}
 	

 class Members{
 	String m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
 	int memno, mem;
 	int C1 = 0,C2 = 0,C3 = 0,C4 = 0;
 	int ch=0;
 	void memdetail() //here the mom will enter the names and no.of members in the family
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the no.of members (8,9 or 10");
 		memno = sc.nextInt();
 		sc.nextLine();
 		if(memno==8)
 		{
 			System.out.println("Enter member 1 name: ");
 			m1 =sc.nextLine();
 			System.out.println("Enter member 2 name: ");
 			m2 =sc.nextLine();
 			System.out.println("Enter member 3 name: ");
 			m3 =sc.nextLine();
 			System.out.println("Enter member 4 name: ");
 			m4 =sc.nextLine();
 			System.out.println("Enter member 5 name: ");
 			m5 =sc.nextLine();
 			System.out.println("Enter member 6 name: ");
 			m6 =sc.nextLine();
 			System.out.println("Enter member 7 name: ");
 			m7 =sc.nextLine();
 			System.out.println("Enter member 8 name: ");
 			m8 =sc.nextLine();
 		}
 		else if(memno==9)
 		{
 			System.out.println("Enter member 1 name: ");
 			m1 =sc.nextLine();
 			System.out.println("Enter member 2 name: ");
 			m2 =sc.nextLine();
 			System.out.println("Enter member 3 name: ");
 			m3 =sc.nextLine();
 			System.out.println("Enter member 4 name: ");
 			m4 =sc.nextLine();
 			System.out.println("Enter member 5 name: ");
 			m5 =sc.nextLine();
 			System.out.println("Enter member 6 name: ");
 			m6 =sc.nextLine();
 			System.out.println("Enter member 7 name: ");
 			m7 =sc.nextLine();
 			System.out.println("Enter member 8 name: ");
 			m8 =sc.nextLine();
 			System.out.println("Enter member 9 name: ");
 			m9 =sc.nextLine();
 			
 		}
 		else if (memno==10)
 		{
 			System.out.println("Enter member 1 name: ");
 			m1 =sc.nextLine();
 			System.out.println("Enter member 2 name: ");
 			m2 =sc.nextLine();
 			System.out.println("Enter member 3 name: ");
 			m3 =sc.nextLine();
 			System.out.println("Enter member 4 name: ");
 			m4 =sc.nextLine();
 			System.out.println("Enter member 5 name: ");
 			m5 =sc.nextLine();
 			System.out.println("Enter member 6 name: ");
 			m6 =sc.nextLine();
 			System.out.println("Enter member 7 name: ");
 			m7 =sc.nextLine();
 			System.out.println("Enter member 8 name: ");
 			m8 =sc.nextLine();
 			System.out.println("Enter member 9 name: ");
 			m9 =sc.nextLine();
 			System.out.println("Enter member 10 name: ");
 			m10 =sc.nextLine();
 		}
 		
 		
 }
 	void vote() //here the member will vote for their dish
 	{
 		Scanner sc = new Scanner(System.in);
 		if(memno==8)
 		{
 			System.out.println("Which Member are you (Choose 1,2,3..)"+"\n 1."+m1+"\n 2."+m2+"\n 3."+m3+"\n 4."+m4+"\n 5."+m5+"\n 6."+m6+"\n 7."+m7+"\n 8."+m8);
 			mem = sc.nextInt();
 			sc.nextLine();
 			System.out.println("Choose Dish");
 			ch = sc.nextInt();
 		    switch (ch)
 			{
 			case 1:
 				C1++;
 				System.out.println("Dish 1 Selected");
 	            break;
 	        case 2:
 	            C2++;
 	            System.out.println("Dish 2 Selected");
 	            break;
 	        case 3:
 	            C3++;
 	            System.out.println("Dish 3 Selected");
 	            break;
 	        case 4:
 	            C4++;
 	            System.out.println("Dish 4 Selected");
 	            break;
 	        default:
 	            System.out.println("Enter the Valid Choice Available");
 	        }
 	    }
 		
 		else if(memno==9)
 		{
 			System.out.println("Which Member are you (Choose 1,2,3..)"+"\n 1."+m1+"\n 2."+m2+"\n 3."+m3+"\n 4."+m4+"\n 5."+m5+"\n 6."+m6+"\n 7."+m7+"\n 8."+m8+"\n 9."+m9);
 			mem = sc.nextInt();
 			sc.nextLine();
 			System.out.println("Choose Dish");
 			ch = sc.nextInt();
 		    switch (ch)
 			{
 			case 1:
 				C1++;
 				System.out.println("Dish 1 Selected");
 	            break;
 	        case 2:
 	            C2++;
 	            System.out.println("Dish 2 Selected");
 	            break;
 	        case 3:
 	            C3++;
 	            System.out.println("Dish 3 Selected");
 	            break;
 	        case 4:
 	            C4++;
 	            System.out.println("Dish 4 Selected");
 	            break;
 	        default:
 	            System.out.println("Enter the Valid Choice Available");
 	        }
 		}
 		else if(memno==10)
 		{
 			
 			System.out.println("Which Member are you (Choose 1,2,3..)"+"\n 1."+m1+"\n 2."+m2+"\n 3."+m3+"\n 4."+m4+"\n 5."+m5+"\n 6."+m6+"\n 7."+m7+"\n 8."+m8+"\n 9."+m9+"\n 10."+m10);
 			mem = sc.nextInt();
 			sc.nextLine();
 			System.out.println("Choose Dish");
 			ch = sc.nextInt();
 		    switch (ch)
 			{
 			case 1:
 				C1++;
 				System.out.println("Dish 1 Selected");
 	            break;
 	        case 2:
 	            C2++;
 	            System.out.println("Dish 2 Selected");
 	            break;
 	        case 3:
 	            C3++;
 	            System.out.println("Dish 3 Selected");
 	            break;
 	        case 4:
 	            C4++;
 	            System.out.println("Dish 4 Selected");
 	            break;
 	        default:
 	            System.out.println("Enter the Valid Choice Available");
 	        }
 		}
 	}
 	
 	void algo() //algorithm to find the max votes
 	{
 		int MaxVotes=0;
         MaxVotes=Math.max(C1, C2);
         MaxVotes=Math.max(MaxVotes,C3);
         MaxVotes=Math.max(MaxVotes,C4);
         if(MaxVotes==C1)
         System.out.println("Dish 1 has the most votes");
         else if(MaxVotes==C2)
         System.out.println("Dish 2 has the most votes");
         else if(MaxVotes==C3)
         System.out.println("Dish 3 has the most votes");
         else if(MaxVotes==C4)
         System.out.println("Dish 4 has the most votes");
 	}
 }


 public class DishAssignment {

 	public static void main(String[] args) {
 		
 		System.out.println("Welcome to the app, Mom can use options 1 and 2 to fill in details and each member can use option 3 to vote for the dish.");
 		Mother m1 = new Mother();
 		Members m2 = new Members();
 		while (true){
 		Scanner sc = new Scanner(System.in);
 		System.out.println("What do you want to do;\n 1. Enter dishes,\n 2. Enter No.of members,\n 3. Choose dish (for member),\n 4. View mosted voted Dish,\n 5. Stop");
 		int opt = sc.nextInt();
 		switch (opt)
 		{
 		case 1:
 			opt = 1;
 			m1.enterDish();
 			continue;
 		case 2:
 			opt = 2;
 			m2.memdetail();
 			continue;
 		case 3:
 			opt = 3;
 			m2.vote();
 			continue;
 		case 4:
 			opt = 4;
 			m2.algo();
 			continue;
 		}
 		if(opt==5)
 			System.out.println("Thank you for using the dish app!");
 			break;
 			
 			
 		}
 		}
 		
 	}




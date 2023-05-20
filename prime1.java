//a number that is divisible only by itself and 1
public class prime1
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  nonprimeNumbers = "";

       for (i = 22; i <= 42; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter !=2)
	  {
	     //Appended the Prime number to the String
	     nonprimeNumbers = nonprimeNumbers + i + " ";
	  }	
       }	
       System.out.println("non Prime numbers from 22 to 42 are :");
       System.out.println(nonprimeNumbers);
   }
}



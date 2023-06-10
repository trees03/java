//anonymous inner class:no name
//constructor not allowed
//created within expression/method
//we can instantiate/creating obj is allowed
//there are methods in it
//extends abstract class
//also extends interface(implements)
//basically supports inheritance
//usage
//extending and implementing functionalities
//command line,input streamreader, scanner
interface Rewards
{
	static int points=0;
	abstract void points();
}
class BonusPoints
{
	public void createClass()
	{
		int x=5;
		Rewards r1=new Rewards()
				{

					public void points() 
					{
						System.out.println("Your bonus: "+(points+x));
					}
				};
				r1.points();
	}
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Rewards.points);//since static stuff don't need obj
		BonusPoints bp=new BonusPoints();
		bp.createClass();
	}

}

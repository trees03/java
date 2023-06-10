//to not change,count
import java.math.*;
class BiCycle{
	protected int speed;
	protected int gear;
	protected int id=0;

	protected static int noOfBicycles=0;
	BiCycle(){
		System.out.println("This is bicycle");
	}

	public BiCycle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		this.id=++noOfBicycles;
	}
	public static int getCount() {
		return noOfBicycles;
	}
	public  int getId() {
		return id;
	}
	}
	class Hero extends BiCycle{
		String bmodel;
		Hero(String bmodel){
			super(5,35);
			this.bmodel=bmodel;
			this.id=++noOfBicycles;
		}
	}
	
	

public class LearnStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiCycle b=new BiCycle(5,25);
		Hero h=new Hero("Poli");
		System.out.println(BiCycle.getCount());
		System.out.println(b.getId());
	}

}

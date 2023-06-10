import java.io.*;
class EngineX
{
	public void work() 
	{
		System.out.println("Engine of car started");
	}
}
final class CarX
{
	private final EngineX engine;

CarX(EngineX engine){
	this.engine=engine;
}
public void move(){
	engine.work();
	System.out.println("car moving");
}
}
class StudyAggregation {
public static void main(String args[]) {
	EngineX kappa=new EngineX();
	CarX maruti=new CarX(kappa);
	maruti.move();
}
}

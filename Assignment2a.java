/*             Assignment-2 
 1.Immutable class means field of the objects of that class cannot be modified. Here the class is declared as final so
 that child classes are not created.
The inbuilt classes like String, Integer, Double, Char, Float, Boolean,Short,Long,Byte are immutable in java.
the following program demonstrates the use of immutable class.

*/

final class Students{
	 private final int regno;
	 private final String name;
	
	public int get_regno() {
		return regno;
	}
	public String get_name() {
		return name;
	}
	Students(int regno,String name){
		this.regno=regno;
		this.name=name;
	}
}
class Assignment2a {

	public static void main(String[] args) {
		Students obj=new Students(229,"Treesa James");
		System.out.println("Registration number : "+ obj.get_regno());
		System.out.println("Name : "+ obj.get_name());
		//obj.regno=568;       commenting this out because name is both private and final so this line will create error
		//obj.set_eid(234);            there should not be setter functions
		//obj.name="Ghost";    commenting this out because name is both private and final so this line will create error
		//to change the values, we have to use the constructor
		Students obj2=new Students(123,"XYZ");

		System.out.println("Changed registration number: "+ obj2.get_regno());
	}

}



final class Driver{//final means can't be subclassed
	//no setter methods,members should be final
	 private int eid;
	 final String ename;
	
	public int get_eid() {
		return eid;
	}
	public String get_ename() {
		return ename;
	}
	Driver(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
}
class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver obj=new Driver(211,"Bhoot");
		System.out.println("ID: "+ obj.get_eid());
		System.out.println("name: "+ obj.get_ename());
		//obj.eid=568;
		//obj.set_eid(234);
		//obj.ename="Ghost";
		System.out.println("Changed ID: "+ obj.get_eid());
	}

}

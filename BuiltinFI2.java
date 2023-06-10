import java.util.*;
import java.util.function.*;
import java.util.function.Predicate;
public class BuiltinFI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		Collections.addAll(l, "priyadarshan","treesa");
		Predicate<String> p=s->s.length()>10;
		l.stream().filter(p).forEach(System.out::println);
		Consumer<String> con=cs->System.out.println(cs+" hello");
		l.stream().forEach(con);
		
	}

}

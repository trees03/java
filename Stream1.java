import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Stream1 {
//stream()=function
//Stream=interface
//java.util.stream.*;=package
//Collection=interface
//Collections=class
//terminal=consumes
//intermediate=generate stream
//they are not ds
//operations over streams are lazy
//they are unbounded
	public static void main(String[] args) {
		
		Stream<Integer> ist=Stream.of(1,2,3,4,5,6,7,8,9);
		ist.forEach(p->System.out.print(" "+p*2));
		System.out.println();
		Stream<Integer> stream1=Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		stream1.forEach(p->System.out.print(" "+p+9));
		System.out.println();

		List<Integer> l1=new ArrayList();
		for(int i=0;i<10;i++)
			l1.add(i);
		System.out.print(l1);
		System.out.println();

		Stream<Integer> stream3=l1.stream();//collection.stream
		stream3.forEach(p->System.out.print(" "+p*3));
		System.out.println();
		
		l1.stream().map(x->x*3).map(y->y*2).filter(z->z%5==0).forEach(System.out::print);
		//chaining of methods,achieve pipelining
		System.out.println();


	}

}

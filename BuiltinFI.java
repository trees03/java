import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

class Product {
	  private double price = 0.0;

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public void printPrice() {
	    System.out.println(price);
	  }
	}
class Supplier1
{
	int n=15;
	
}

public class BuiltinFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> st= (s)->s.length()>10;
		Predicate<String> st2= (s)->s.startsWith("S");
		String a="successfully";
		boolean result=st.test(a);
		System.out.println(result);
		List<String> l1=new ArrayList<String>();
		Collections.addAll(l1, "greatfullness","usefullness","politeness",a);
		l1.stream().filter(st).forEach(System.out::println);
		l1.stream().filter(st2).forEach(System.out::println);
		Consumer<Product> updateprice=p->p.setPrice(4.8);
		Product p=new Product();
		updateprice.accept(p);
		p.printPrice();
		List<Integer> l2=new ArrayList<Integer>();
		Collections.addAll(l2, 14,15,22);
		Function<Integer,Integer> fun=v->v+100;
		for(int i=0;i<3;i++)
		{
			System.out.println(fun.apply(l2.get(i)));
		}
//fi obj_ref=lambda
	}

}

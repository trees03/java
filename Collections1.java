import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
//collections is a class
//collection=interface
//Arrys.asList changes arrays to list
public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suits= { "Heart","Diamond","Spade","Club"};
		List<String> l1=Arrays.asList(suits);
		ArrayList<Double> lx=new ArrayList<Double>();
		Double[] dd= { 78.7,520.1,58.3};
		Collections.addAll(lx, dd);
		System.out.println(lx);
		
		System.out.printf("Unsorted :%s%n",l1);
		Collections.reverse(l1);
		System.out.printf("reverse :%s%n",l1);
		Collections.sort(l1);
		System.out.printf("sorted :%s%n",l1);
		Collections.sort(l1,Collections.reverseOrder());;


	}

}

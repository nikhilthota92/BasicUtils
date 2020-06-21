import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(40);
		l.add(10);
		l.add(89);
		l.add(2);
		Comparator<Integer> c= (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		
}
}





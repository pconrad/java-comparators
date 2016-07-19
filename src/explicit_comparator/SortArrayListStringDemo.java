import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListStringDemo {
	
	

	public static void main(String [] args) {

		ArrayList<String> als = new ArrayList<String>();
		als.add("Foo");
		als.add("Bar");
		als.add("Baz");
		als.add("Potato");
		als.add("Brick");
		als.add("Llama");

		System.out.println("als=" + als);

		System.out.println("sorting...");
		Collections.sort(als);
		System.out.println("als=" + als);
	}
	
}
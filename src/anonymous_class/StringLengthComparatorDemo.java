package anonymous_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class StringLengthComparatorDemo {

    public static void main(String [] args) {

	/* next line converts String [] args to ArrayList<String> */
	
	ArrayList<String> strings =
	    new ArrayList<String>( Arrays.asList( args) );

	Collections.sort(strings,
			 new Comparator<String>() {
			     public int compare(String s1, String s2) {
				 if (s1.length()==s2.length())
				     return s1.compareTo(s2);
				 else
				     return s1.length() - s2.length();
			     }});
	System.out.println(strings);
	
    }
    
}

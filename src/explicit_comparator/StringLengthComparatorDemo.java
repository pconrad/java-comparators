package explicit_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class StringLengthComparatorDemo {

    public static void main(String [] args) {

	/* next line converts String [] args to ArrayList<String> */
	
	ArrayList<String> strings =
	    new ArrayList<String>( Arrays.asList( args) );

	StringLengthComparator slc = new StringLengthComparator();
	Collections.sort(strings,slc);
	System.out.println(strings);
	
    }
    
}

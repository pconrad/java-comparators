package explicit_comparator;

import java.util.Comparator;

public class StringLengthComparator
    implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
	if (s1.length()==s2.length())
	    return s1.compareTo(s2);
	else
	    return s1.length() - s2.length();
    }
}

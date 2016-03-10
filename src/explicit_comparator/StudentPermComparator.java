package explicit_comparator;

import java.util.Comparator;

public class StudentPermComparator
    implements Comparator<Student>  {
    public int compare(Student s1, Student s2) {
	return s1.getPerm() - s2.getPerm();
    }
};

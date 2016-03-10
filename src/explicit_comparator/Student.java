package explicit_comparator;

import java.util.Comparator;

public class Student  {
        
    private int perm;
    private String lname;

    public Student(int perm, String lname) {
	this.perm = perm;
	this.lname = lname;
    }

    public int getPerm() { return this.perm;}
    public String getName() { return this.lname;}

    public String toString() {
	return "[" + this.perm + "," + this.lname + "]";
    }

    public static void main(String [] args) {
	java.util.ArrayList<Student> classroom =
	    new java.util.ArrayList<Student>();
	classroom.add(new Student(1234567,"Smith"));
	classroom.add(new Student(3345678,"Jones"));
	classroom.add(new Student(2456789,"Perez"));		  
	System.out.println("classroom=" + classroom);

	// named class, named object
	
	StudentPermComparator spc = new StudentPermComparator();
	
	java.util.Collections.sort(classroom,spc);
	System.out.println("sorted by perm classroom=" + classroom);

	// anonymous object
	
	java.util.Collections.sort(classroom,
				   new StudentNameComparator());
	System.out.println("sorted by name classroom=" + classroom);	
    }
    
}
    

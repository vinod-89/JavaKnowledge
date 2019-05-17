import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentMain {

	public static void main(String[] args) {
	ArrayList<Student> students=new ArrayList<Student>();
	students.add(new Student("ram", "ro2", 34));
	students.add(new Student("ravi", "ra1", 29));
	students.add(new Student("vinod", "v1", 30));
	students.add(new Student("amit", "a1", 37));
	Collections.sort(students, new AgeComparator());
	Iterator<Student> it=students.iterator();
	while(it.hasNext()) {
		Student s=(Student)it.next();
		System.out.println(s.age);
	}
	
	}

}

package classesAndObjects;

public class StudentUse {

	public static void main(String[] args) {
		
//		Student s1 = new Student();          // s1 and s2 are the references of the objects.
	
		Student s2 = new Student("Rohit", 2);
		
//		System.out.println(s1);
//		
//		s1.name = "Mohit Jindal";
//		s1.setRollNumber (-10);
//		
//		System.out.println(s1.name + " " + s1.rollNumber);
//		
//		s2.setRollNumber(100);                         
//		
//		System.out.println(s2.rollNumber);
		
		Student s3 = new Student("Mohit", 100);         // Constructor parameters
		s3.print();

		System.out.println(Student.numStudents);
		
	}

}


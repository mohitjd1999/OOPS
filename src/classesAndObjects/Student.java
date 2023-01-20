package classesAndObjects;

public class Student {

	String name;
    int rollNumber;                   // specify properties
    double cgpa;
    public final static double CONVERSIONFACTOR = 0.95;
    public static int numStudents;
    
//    public int getRollNumber() {
//    	return rollNumber;
//    }
//    
//    public void setRollNumber(int num) {
//    	if(num <=10) {
//    		return;
//    	}
//    	rollNumber = num;
//    }
    
    
    public int getRollNumber() {
    	return this.rollNumber;
    }
    
    
    public void setRollNumber(int rollNumber) {      // using this keyword
    	if(rollNumber <= 10) {
    		return;
    	}
    	
    	this.rollNumber = rollNumber;
    }
    
    
    public Student(String n, int rollNumber) {             // Constructors
    	this.name = n;
    	numStudents++;
    	this.rollNumber = numStudents;
    }
    
    public Student(String name) {
    	this.name = name;
    	numStudents++;
    	this.rollNumber = numStudents;
    }
    
    public static int getNumStudents() {
    	return numStudents;
    }
    
    public void print() {
    	System.out.println(name + " " + rollNumber);
    }
	
}




 
package classesAndObjects;

public class ComplexNumbers {
	private int real;
	private int imaginary;
	
//    public int getreal(){
//    	return real;
//    }
//    
//    public void setreal() {
//    	this.real = real;
//    }
//    
//    public int getimaginary1(){
//    	return imaginary;
//    }
//    
//    public void setimaginary() {
//    	this.imaginary = imaginary;
//    }

    
	public ComplexNumbers(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	
	public void plus(ComplexNumbers c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	
	public void multiply(ComplexNumbers c2) {
		
		int newreal = (this.real * c2.real) + (-this.imaginary * c2.imaginary);
		int newimaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);
		real = newreal;
		imaginary = newimaginary;
	}
	
	public void print() {
		System.out.println(real + " +i" + imaginary);
	}
}

package exceptionHandling;

public class ExceptionDemo {
	
//	 public static int fact(int n) throws NegativeNumberException{
//		 
//		 if(n<0) {
//			 throw new NegativeNumberException();
//		 }
//		 
//		 int ans=1;
//		 for(int i=n; i<=2; i--) {
//			 ans *= n;
//		 }
//		 
//		 return ans;
//	 }
//		
//	 public static int divide(int a, int b) throws DivideByZeroException{
//		 
//		 if(b==0) {
//			 throw new DivideByZeroException();
////			 throw new ArithmeticException();
//		 }
//			 return a/b;
//	}
//		

	public static void main(String[] args) {

//		try {
//			fact(1);
//			divide(10, 0);
//			System.out.println("Within Try block");
//		}catch(DivideByZeroException e){
//		   System.out.println("Divide by zero exception");
//		}catch(NegativeNumberException e) {
//			System.out.println("Negative Number exception");
//		}catch(Exception e) {
//			System.out.println("Generic Exception");
//		}finally {
//			System.out.println("Finally block");
//		}
//		
//		System.out.println("Main");
		
		try {
			throw new DivideByZeroException();
//			int result = 10/0;
			
		}catch(DivideByZeroException e) {
			System.out.println("Hello");
		}catch(Exception e) {
			System.out.println("Hi");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("Main");
		
	}

}

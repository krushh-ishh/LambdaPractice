package Practice1;

import Practice2.Second;
import Practice2.SecondFI;
import Practice3.ThirdFI;

public class Main {

	public static void main(String[] args) {
		
		 
		System.out.println("System starts...");	
		
		
		//----------------PRACTICE 1------------------------
		
//		//implementing fi using normal class
//		FIFirst fi = new First();
//		fi.func1();
//		
//		
//		//implementing fi using  anonymous class 
//		
//		FIFirst fi1 = new FIFirst() {
//			
//			@Override
//			public void func1(){
//				
//				System.out.println("Using anonymous first Interface function");
//			}
//		};
//		fi1.func1();
//
//		//implementing fi using lambda expression
//		
//		FirstFI fi2 = ()->
//		System.out.println("Using lambda function");
//		fi2.func1();
		
		
		//----------------PRACTICE 2------------------------
		
		//implementing fi using normal class
		SecondFI sfi1 = new Second();
		System.out.println("using normal class "+sfi1.sum(16,45));
		
		//implementing fi using lambda expression 
		SecondFI sfi =(a,c)-> {
			int d= a+c; 
			return d;
		};
		
		System.out.println("using lambda expression "+sfi.sum(10,20));
		
		
		
		//----------------PRACTICE 3------------------------
		
		//implementing fi using normal class
		
		
		//implementing fi using lambda expression 
		
		ThirdFI tfi = str -> str.length();
		System.out.println("using lambda expression "+tfi.getLength("10,20"));
	}

}


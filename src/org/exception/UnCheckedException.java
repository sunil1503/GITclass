package org.exception;
//exception handling
public class UnCheckedException {

	public static void main(String[] args) {

		System.out.println(2);
		System.out.println(4);
		
		try {
			
			String s = "java ";
			System.out.println(s.charAt(6));
			
			System.out.println(5/0);
			
			String s2 = null;
			System.out.println(s2.length());
	
		
		}catch (ArithmeticException e ) {
			System.out.println("am in 1st catch ");
			
		}catch (NullPointerException e ) {
		System.out.println("am in 2nd catch ");
		
		}catch (Exception e) {
		System.out.println("am in 3rd catch" );
		}
		System.out.println(6);
		
	}
	
	
	
	
}

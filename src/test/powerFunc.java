package test;

public class powerFunc {
	public static int power(int base,int powers) {
		int result=base;
		int increment=base;
		for(int i=1;i<powers;i++) {
			for(int j=1;j<base;j++) {
				result += increment;
			}
			increment = result;
			System.out.println(result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int result = power(5,6); 
		System.out.println("Result = "+result);
	}
}

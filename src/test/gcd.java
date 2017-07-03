package test;

public class gcd {

	public static void main(String[] args) {
		int a=12,b=9;
		int x = gcdMethod(a,b);
		System.out.println(x);
	}
	
	static int gcdMethod(int a, int b)
	{
	  while(a!=0 && b!=0) // until either one of them is 0
	  {
	     int c = b;
	     b = a%b;
	     a = c;
	     System.out.println(a + " " + b + " "+ c );
	  }
	  return a+b; // either one is 0, so return the non-zero value
	}
}

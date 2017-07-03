package test;

public class PalinDrome {
	
	    public static boolean isPalindrome(String word) {
	        word = word.toLowerCase();
	        boolean result = false;
	        String myWord="";
	        for(int i=word.length()-1;i>=0;i--) {
	            myWord = myWord + word.charAt(i);
	        }
	        if(word.equals(myWord)) {
	            result = true;
	        }
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(PalinDrome.isPalindrome("Deleveled"));
	    }
	
}

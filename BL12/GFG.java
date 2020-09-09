// java implementation to 
// print the given pattern recursively 
import java.io.*; 

class GFG { 
	
	// function to print the 
	// given pattern recursively 
	static void printPatternRecur(int n, int i) 
	{ 
		// base condition 
		if (n < 1) 
			return; 
		
		// to print the stars of 
		// a particular row 
		if (i <= n) 
		{ 
			System.out.print ( "* "); 
			
			// recursively print rest 
			// of the stars of the row 
			printPatternRecur(n, i + 1); 
		} 
		
		else
		{ 
			// change line 
			System.out.println( ); 
			
			// print stars of the 
			// remaining rows recursively 
			printPatternRecur(n - 1, 1); 
		} 
	} 
	
	// Driver program 
	public static void main (String[] args) 
	{ 
		int n = 5; 
		printPatternRecur(n, 1); 
		
	} 
} 

// This code is contributed by vt_m 

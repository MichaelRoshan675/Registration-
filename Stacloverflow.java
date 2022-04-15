package mypack;

import java.util.*;
public class stackoverflow {
	public static int fact(int n) {
		if(n==1) {
//			return fact(n-1);
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Find Factorial : ");
			int n = sc.nextInt();
//			for(int i=1;i<=n;i++)?
			System.out.println(fact(n)); 
		}
		catch(StackOverflowError e){
			System.out.print(e);
			
		}
	}
}

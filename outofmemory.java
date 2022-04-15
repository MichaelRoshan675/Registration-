package mypack;
import java.util.*;
public class Outofmemory {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
		int[] ar = new int[100000*100000];
		}
		catch(OutOfMemoryError e) {
			System.out.println("Too much space occupied");
		}
	}
}

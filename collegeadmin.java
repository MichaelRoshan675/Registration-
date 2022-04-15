package pack;
import mypack.*;
import java.util.*;
public class collegeadmin {
	public static void main(String args[]) {
		admin ad =  new admin();
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> hp = new HashMap<Integer,String>();
		System.out.println("\nWelcome To Oxford.........\n");
		while(true) {
			System.out.println("\nFuntionalities\n\t1. new entry\n\t2. View entry\n\t3. delete entry\n\t4. View All Details\n\t5. update\n\t6/. quit ");
			System.out.println("\nEnter ur choice :");
			int choice = Integer.parseInt(sc.next());
			
			switch(choice) {
				case 1 :   System.out.println("Enter the name of the candidate : ");
				           String name =  sc.next();
						   ad.newentry(name);
						   break;
	
				case 2 :   System.out.println("Enter the id number : ");
						   int idnum = Integer.parseInt(sc.next());      
						   ad.viewentry(idnum);
						   break;
				
				case 3 :   System.out.println("Enter the id number : ");
						   int id = Integer.parseInt(sc.next()); 				
 						   ad.deleteentry(id);
						   break;
				
				case 4 :   ad.viewall();
						   break;
						   
				case 5 :   System.out.print("Enter the id number : ");
						   int n = Integer.parseInt(sc.next());
						   System.out.println("Enter the oldname :");
						   String oldname = sc.next();
						   System.out.println("Enter the new name :");
						   String newname =  sc.next();
						   ad.update(n, oldname, newname);
						   break;
			    
				case 6 :   System.exit(0) ;		   
				
				default : break;
				
						
			}
			
		}
	}
}

package mypack;
import pack.*;

import java.util.HashMap;
import java.util.Iterator;
public class admin extends collegeadmin{
	static int id = 1910000;
	final String adminname;
	collegeadmin cd = new collegeadmin();
	HashMap<Integer,String> hp = new HashMap<Integer,String>();
	protected static void change() {
		id+=1;
	}
	public void newentry(String name) {
		change();
		System.out.println("Entry added successfully");
		hp.put(id, name);
	}
	public void viewentry(int idnum) {
//		System.out.println("Enter id number: ");
		System.out.println("Candidate Name : "+hp.get(idnum));
	}
	public void deleteentry(int idnum) {
		hp.remove(idnum);
		System.out.print("Candidate removed successfully");
	}
	public void update(int idnum,String oldname,String newname) {
		hp.replace(idnum, oldname, newname);
		System.out.println("Updated successfully");
		viewentry(idnum);
	}
	public void viewall() {
		if(hp.isEmpty()) {
			System.out.println("\nNo entries Recorded");
		}
		Iterator<Integer> it = hp.keySet().iterator();
		while(it.hasNext()) {
			int key = (int)it.next();
			System.out.println("\nId : "+key+"\nName: "+hp.get(key)+"\nadmin name: "+adminname);
		}	
	}
	public admin(){
		this.adminname = "admin";	
	}
}

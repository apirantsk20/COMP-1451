package ca.bcit.comp1451.session1LabB;

import java.util.ArrayList;
import java.util.Iterator;

public class Club {
  
	private ArrayList<Member> mem;

	public Club() {
		
		mem = new ArrayList<Member>();
		
	}
	
	public void join(Member member) {
		
		if(member != null) {
		mem.add(member);
		}
		
	}
	
	public int numberOfMembers() {
		int i = 0;
		for(Member m : mem) {
			i++;
		}
		return i;
	}
	
	public void showMembers() {
		
		for(Member m : mem) {
			m.displayMember();
		}
		
	}
	
	public void showMembersByYear(int year) {
		
		
		Iterator<Member> iter = mem.iterator();
		
		
		while(iter.hasNext()) {

			Member m = iter.next();
			
			if(year == m.getYearOfJoining()) {
				m.displayMember();
			}
			
		}
		
	}
	
	public void removeMembersByYear(int year) {
		
		
	Iterator<Member> iter = mem.iterator();
		
		
		while(iter.hasNext()) {

			Member m = iter.next();
			
			if(year == m.getYearOfJoining()) {
				iter.remove();
			}
			
		}
		
	}
	
}

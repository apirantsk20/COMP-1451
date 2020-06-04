package ca.bcit.comp1451.session1LabB;

public class Driver {

	public static void main(String[] args) {
		
		Member member = new Member(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        member.displayMember();
		Club club = new Club();
		club.join(new Member("Simran", "Kaur", 8, 2018));
		club.join(new Member("Baldev", "Singh", 2, 2019));
		System.out.println("Member of the club:");
		club.showMembers();
		System.out.println("Member of the club of year 2018");
		club.showMembersByYear(2018);
		System.out.println("Members of the after removing the member of the club of year 2018");
		club.removeMembersByYear(2018);
		club.showMembers();
	}

}

package Chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		//메서드를 통해서 팀명을 초기화
		
		t.setTeamName("한라봉");
		System.out.println("팀명 : "+t.getTeamName());
		System.out.println("--------[팀원 명단]--------");
		team.init();
		team.Disp();
		
		System.out.println();
		t.setmName("김창우");
		t.setMphone("010-2482-5660");
		t.setsName("백유기");
		t.setName("정세나, 김우태, 박수연, 박범준");
		
		System.out.println("팀장 : "+t.getmName());
		System.out.println("팀장 전화번호 : "+t.getMphone());
		System.out.println("부팀장 : "+t.sName);
		System.out.println("팀원 : "+t.getName());
		
		
		
	}

}

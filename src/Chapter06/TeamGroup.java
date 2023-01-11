package Chapter06;

public class TeamGroup {
	
	//멤버변수(배열 ->팀원구성)
	private  TeamMember[] member  = new TeamMember[6];
	
	public void init() {
		member[0]=new TeamMember("김창우","남");
		member[1]=new TeamMember("정세나","여");
		member[2]=new TeamMember("김우태","남");
		member[3]=new TeamMember("박수연","여");
		member[4]=new TeamMember("백유기","남");
		member[5]=new TeamMember("박범준","남");
	}
	
	//출력 메소드
	public void Disp() {
		for(int i=0;i<member.length;i++) {			
			System.out.print("성명 : "+member[i].getName());
			System.out.println(", 성별 : "+member[i].getGender());
		}
	}
	
	
	
	
	
}

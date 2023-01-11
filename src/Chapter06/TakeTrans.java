package Chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames = new StdInfo("James",12000);
		StdInfo studentTom = new StdInfo("Tom",10000);
		StdInfo studentAmy = new StdInfo("Amy",20000);
		
		
		//버스타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		Bus bus350 = new Bus(350);
		studentAmy.takeBus(bus350);
		
		
		Subway subway1 = new Subway("2호선");
		studentTom.takeSubway(subway1);
		
		//정보확인
		studentJames.showInfo();//지출
		bus100.showInfo();//숭입증가 인원수 증가
		studentAmy.showInfo();
		bus350.showInfo();
		
		studentTom.showInfo();
		subway1.showInfo();
	}

}

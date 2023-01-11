package Chapter06;

public class Subway {
	
	//멤버
	public String lineNumber;
	int passengerCounter;
	int money; //지하철 수입
	
	//디폴트 생성자 생략
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {//승객이 낸 돈
		this.money+=money; //지하철의 수입 증가
		passengerCounter++;//승객 수
	}
	
	public void showInfo() { //지하철의 정보를 출력
		
		System.out.println("지하철 "+lineNumber+" 승객은 "+passengerCounter+"명이고, 수입은 "+money+"원 입니다");
		
	}
	
}


package Chapter05;

public class FunTest_Overloading {
	// 필드 = 멤버변수
	// 생성자(디폴트 생략)
	// 다형성을 만족
	// overloading : 메소드면을 통일성 있게 사용해야하는 경우 메소드의 메개변수를 종륭허 갯수를 다르게하여 구현

	public void getReult(int n) {
		System.out.println(n + "은(는) int 입니다");
	}

	public void getReult(String n) {
		System.out.println(n + "은(는) String 입니다");
	}

	public void getReult(char n) {
		System.out.println(n + "은(는) char 입니다");

	}
	public void getReult(String n,int s) {
		System.out.println(n + "은(는) String "+s+"은(는) int 입니다");
		
	}

}

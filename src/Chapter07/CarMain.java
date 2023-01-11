package Chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		
		
		//생성자를 통하여 초기화
		Car myCar = new Car("blue",10);
		//멤버변수에 직접 접근해서 초기화 후 출력
		myCar.cc = 3000;
		myCar.color="검정";
		System.out.println("---------------------------------");
		
		//메서드를 이용한 출력
		System.out.println("cc : "+myCar.cc);
		System.out.println("color : "+myCar.color);
		System.out.println("---------------------------------");
		
		System.out.println("cc : "+myCar.getColor());
		System.out.println("color : "+myCar.getCc());
		
	}

	private static Object car(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		
		//int num1=12345678900; 32비트 = 4Byte
		long num2=12345678900L; //선언하고 초기화도 됨
		long num3=1000; //long형의 64비트이지만 L로 선언을 안했으므로 int로 인식
		
		int level; //선언만하고 초기화되지 않음
		level=10; //리터널값
		
		System.out.println(num2+num3); // 결과값 : long / long과 int가 있으면 더 큰값으로 결과값이 나옴
		System.out.println(level);

	}

}

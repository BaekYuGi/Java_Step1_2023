package chapter02;

public class Example01 {

	public static void main(String[] args) {
		
		/* Soldesk 과수원
		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개이다

		과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고, 시간당(24) 전체 과일의 평균 생산갯수를 출력하시오
		(단, 평균값을 담는 데이터 타입은 float으로 정의한다)
		*/
		
		int pear=5;
		int apple=7;
		int orange=5;
		
		char ch1='\uAC1C';
		
		int result;
		
		result=pear+apple+orange;
		
		System.out.print("과수원에서 하루에 생산되는 총 과일의 갯수 : "+ (result));
		System.out.println(ch1);
		
		
		System.out.print("시간당 전체 과일의 평균 생산 갯수 : "+ (float)(result)/24);
		System.out.println(ch1);

	}

}
package chapter04;

public class ArraySumTest {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		
		int sum=0;
		double avg;
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			sum += score[i];
		}
		avg=(double)sum/score.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		//반올림
		System.out.println("평균 : "+ Math.round(avg));

	}

}

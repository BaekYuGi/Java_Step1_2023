package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		
		int[][] array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;
		double avg=0;
		int total=0;
		
		int count=0;
		System.out.println("========================");
		for(int i=0; i<array.length; i++) {
			sum=0;
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
			} 
			avg=(double)sum/array[i].length;
			System.out.print("총점 : "+sum+" , ");
			System.out.printf(" 평균 : %.1f |\n",avg);
			System.out.println("========================");
	    }
//		for(int[] num : array) {
//			total=0;
//			for(int score : num) {
//				total+=score;
//			}
//			count++;
//			System.out.println(count+"번째 학생의 합계 : "+total);
//		}

	}

}

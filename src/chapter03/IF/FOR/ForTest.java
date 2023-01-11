package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받고
		// 총점과 평균을 구하시오 (단, 평균은 실수로 출력할것)
		
		Scanner scan=new Scanner(System.in);
		int i, sum=0, cnt=0;
		double avg=0;
		
		System.out.print("몇명의 학생 점수를 입력 받으시겠습니까? : ");
		int stu=scan.nextInt();
		
		for(i=0; i<stu; i++) {
			System.out.print((i+1)+"번째 학생의 점수를 입력하세요 : ");
			int score=scan.nextInt();
			cnt++;
			sum+=score;
		}
		avg=sum/cnt;
		
		System.out.println((stu)+"명의 총 점수는 "+(sum)+"점 입니다.");
		System.out.println((stu)+"명의 평균점수는 "+(avg)+"점 입니다.");
		
	}

}

package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		//0을 입력하면 종료
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num=scan.nextInt();
			if(num==0) {
				System.out.println("프로그램이 종료됐습니다");
				break;
			} else {
				sum+=num;
				cnt++;
				avg=sum/(double)cnt;
			}
			System.out.println("총합 : "+sum+", 평균 : "+avg);
		}

	}

}

package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int score[]= {};
		int stu=0;
		int max=0;
		int sum=0;
		double avg=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 > ");
			int num=scan.nextInt();
			if(num==0) {
				System.out.println("잘못된 번호입니다.");
				System.out.println("다시 입력해주세요.");
			} else if(num>5) {
				System.out.println("잘못된 번호입니다.");
				System.out.println("다시 입력해주세요.");
			}
			if(num==1) {
				System.out.print("학생수 > ");
				stu=scan.nextInt();
				score=new int[stu];
				if(stu<0) {
					System.out.println("잘못된 번호입니다.");
					System.out.println("다시 입력해주세요.");
				} 
			} else if(num==2) {
                for(int i=0; i<score.length; i++) {
                	System.out.print("score["+(i+1)+"] : ");
                	score[i]=scan.nextInt();
                	sum+=score[i];
                }
                
			} else if(num==3) {
				for(int i=0; i<score.length; i++) {
					System.out.println("score["+(i+1)+"] : "+score[i]);
				}
			} else if(num==4) {
				for(int i=0; i<score.length; i++) {
					if(max<score[i]) {
						max=score[i];
					}
				
			}
				avg=(double)sum/stu;
				System.out.printf("최고 점수 : %d\n",max);
				System.out.printf("총점 : %d\n",sum);
				System.out.printf("평균 : %.2f\n",avg);
		
	} else if(num==5) {
		System.out.println("프로그램 종료");
		break;
	}
		}

	}

}

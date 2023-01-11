package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수부터 100까지의 합을 출력하시오
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=scan.nextInt();
		int sum=0;
		
		for(int i=num; num<=100; num++) {
			sum+=num;
		}
		System.out.println("입력하신 숫자부터 100까지의 합은 "+sum+"입니다.");
		*/
		
		
		// 1부터 10까지 반복하면서 정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력
		// 단 입력받은 수가 0이면 무시
		
		
		Scanner scan=new Scanner(System.in);
		int num, cnt=0;
		
		System.out.println("1부터 10까지 반복하면서 정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력");
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"번째 숫자를 입력해주세요 : ");
			num=scan.nextInt();
			if(num==0) {
				continue;
				}
			if(num%2==0) {
				cnt++;
			}
			
			
		}
		System.out.println("입력한 수중 짝수의 갯수는 "+cnt+"입니다.");

	}

}

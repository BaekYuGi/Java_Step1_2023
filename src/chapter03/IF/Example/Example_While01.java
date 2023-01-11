package chapter03.IF.Example;

import java.util.Scanner;

public class Example_While01 {

	public static void main(String[] args) {
	    
		boolean run=true;
		
		int balance=0;
		int balance1=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			int num=scan.nextInt();
			
			if(num==1) {
				System.out.print("예금액을 입력해주세요 : ");
				balance+=scan.nextInt();
				System.out.println("예금액 > "+balance+"원");
				System.out.println();
				if(balance==0) {
					System.out.println("잘못된 금액입니다.");
					System.out.println("다시 입력해주세요.");
				}
			} else if(num==2) {
				System.out.print("출금액을 입력해주세요 : ");
				balance1=scan.nextInt();
				if(balance1>balance) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("다시 입력해주세요.");
				} else {
					System.out.println("출금액 > "+balance1+"원");
					System.out.println();
					balance-=balance1;
				}
			} else if(num==3) {
				System.out.println("잔고 > "+balance+"원");
				System.out.println();
			} else if(num==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}

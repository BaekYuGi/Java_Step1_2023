package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num;
		String menu = "";
		
		while(true) {
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n작업할 번호를 선택해주세요 : ");
			num=scan.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:
				menu="입력하기를 ";
				break;
			case 2:
				menu="출력하기를 ";
				break;
			case 3:
				menu="삭제하기를 ";
				break;
			case 4:
				menu="끝내기를 ";
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println(menu+"선택하셨습니다.");
			if(num==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}

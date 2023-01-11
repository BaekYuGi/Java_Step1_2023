package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스변수 scan에 값을 입력받음
		// A or a -> 우수고객 / B or b -> 일반회원 / 나머지 -> 고객
		// charAt(0) : String -> char
		
		Scanner scan=new Scanner(System.in);
		System.out.print("등급을 입력하세요(A(a) or B(b) or C) : ");
		char grade;
		String g;
		
		grade=scan.nextLine().charAt(0);
		
		//switch로 판단
		
		/*
		switch (grade) {
		case 65: case 97:
			System.out.println("우수고객 입니다.");
			break;
		case 66: case 98:
			System.out.println("일반회원 입니다.");
			break;
		default:
			System.out.println("고객 입니다.");
		}
		*/
		
		
		switch (grade) {
		case 65: case 97:
			g="우수고객";
			break;
		case 66: case 98:
			g="일반회원";
			break;
		default:
			g="고객";
		}
		System.out.println(g+" 입니다.");

	}

}

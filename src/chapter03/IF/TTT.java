package chapter03.IF;

import java.util.Scanner;

public class TTT {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("아이디를 입력하십시오 : ");
		String ID=(scan.nextLine());
		System.out.print("비밀번호를 입력하십시오 : ");
		String PW=(scan.nextLine());
		
		int pass=Integer.parseInt(PW);
		/*
		if(ID.equals("JAEMIN")) {
			if(pass==12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("로그인 실패");
		}
*/
		
		//논리 연산자
	
		if(ID.equals("JAEMIN") && (pass==12345)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
			
		
		
	}

}

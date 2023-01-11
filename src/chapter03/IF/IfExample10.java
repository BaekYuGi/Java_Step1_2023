package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample10 {

	public static void main(String[] args) {
		// Scanner scan이라는 인스턴스 변수 선언
		
		// ID라는 변수로 아이디 받기
		
		// PW라는 변수fh 비밀번호 받기(String) => 숫자로 받되 String
		
		// int형으로 형변환
		
		// 중첩질의를 사용하여 로그인 성공과 비밀번호 다름, 아이디 없음
		
		Scanner scan=new Scanner(System.in);
		String ID = "JAEMIN";
		int PW = 12345;
		
		System.out.print("아이디를 입력하십시오 : ");
		String id=(scan.nextLine());
		System.out.print("비밀번호를 입력하십시오 : ");
		int pass=Integer.parseInt(scan.nextLine());
		
		if(ID.equals(id)) {
			if(PW == pass) {
				System.out.println(ID + "님 환영합니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}

	}

}

package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		
		String ID="JAEMIN";
		int PW=221230;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String inputID=(scan.nextLine());
		
	    if(ID.equals(inputID)) {   	
	    	System.out.print("비밀번호를 입력하세요 : ");
	    	int inputPW=Integer.parseInt(scan.nextLine());
	    	if(PW==inputPW) {
	    		System.out.println("로그인 성공");
	    	} else {
	    		System.out.println("비밀번호를 확인해주세요.");
	    	}
	    } else {
	    	System.out.println("아이디를 확인해주세요.");
	    }

	}

}

package Chapter05;

import java.util.Scanner;

public class FunTest07 {
	public FunTest07() {
		// TODO Auto-generated constructor stub
	}
	/*
	public static String Edustep(int edu) {
		
		String step;
		
		if(edu==1) {
			step="1단계";
		}else if(edu==2) {
			step="2단계";
		}else if(edu==3) {
			step="3단계";
		}else {
			step="해당하는 스터디단계가 없습니다";
		}return step;
		
	}*/
	public static void Edustep(int edu) {
		
		String step;
		
		if(edu==1) {
			step="1단계";
		}else if(edu==2) {
			step="2단계";
		}else if(edu==3) {
			step="3단계";
		}else {
			step="해당하는 스터디단계가 없습니다";
		}
		System.out.println(step+" 입니다");
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("스터디 단계를 입력하세요 : ");
		int a = scan.nextInt();
		//return 값이 있는경우
//		System.out.println(Edustep(a));
//		String step = Edustep(a);
//		System.out.println("현재 수업 단계는 : "+step+" 입니다.");
		
		//return값이 없는 경우
		
		Edustep(a);
		
		
	}

}

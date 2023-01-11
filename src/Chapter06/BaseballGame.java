package Chapter06;

import java.util.Scanner;



public class BaseballGame {
	public int user1;
	public int user2;
	public int user3;
	public int com1=0;
	public int com2=0;
	public int com3;
	public int strike = 0;
	public int ball = 0;
	public String check="";
	
	Scanner scan = new Scanner(System.in);
	public BaseballGame() {
		
		while (true) {

			System.out.println("--1 ~ 9 사이의 수를 입력하세요--");
			System.out.print("첫번째 수를 입력하세요 : ");
			user1 = scan.nextInt();
			System.out.print("두번째 수를 입력하세요 : ");
			user2 = scan.nextInt();
			System.out.print("세번째 수를 입력하세요 : ");
			user3 = scan.nextInt();
			
			if (user1 == com1) {
				strike++;
			} else if (user1 == com2 || user1 == com3) {
				ball++;
			}
			if (user2 == com2) {
				strike++;
			} else if (user2 == com1 || user2 == com3) {
				ball++;
			}
			if (user3 == com3) {
				strike++;
			} else if (user3 == com1 || user3 == com2) {
				ball++;
			}
			if (strike == 3) {
				System.out.println("정답 = " + com1 + com2 + com3);
				check ="WIN";
				break;
			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + " Strike, " + ball + " Ball");
				} else {
					System.out.println("OUT!!");
					System.out.println("===================");
				}
			}
		}
	}
	public String check(){
			if(strike == 3) {
				check ="WIN";
			}
			return check;
		}

}

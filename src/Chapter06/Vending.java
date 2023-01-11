package Chapter06;

import java.util.Scanner;

public class Vending {
	
	//멤버변수
	private Can can[]= new Can[5];
	private int money;
	
		
	
	//메소드 
	public void init() {
		can[0]=new Can("환타",1000);
		can[1]=new Can("코카콜라",2500);
		can[2]=new Can("칠성사이다",1500);
		can[3]=new Can("밀키스",2000);
		can[4]=new Can("참이슬",2500);
	}
	
	//사용 가능한 음료만 보여주기
	public void showCans(int m) {
		money = m;

		for(int i=0;i<can.length;i++) {
			//돈과 가격과 비교 판단
			if(can[i].getPrice()<=money) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice()+"원");
			}
		}
		
	}
	//선택한 음료수 제공과 잔액
	public void outCan(String name) {
		for(int i=0;i<can.length;i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+"을(를) 선택하셨습다");
				System.out.println("잔액 : "+(money-can[i].getPrice())+"원");
			}
		}
	}
}

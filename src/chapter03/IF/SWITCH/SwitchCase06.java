package chapter03.IF.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// am 9:00 ~ pm 6:00
		
		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재 시각 : "+time+"시]");
		
		switch (time) {
		case 9: case 11: case 13: case 15: case 17:
			System.out.println("수업듣기");
			break;
		case 12:
			System.out.println("점심먹기");
			break;
		case 10: case 14: case 16:
			System.out.println("복습하기");
			break;
		default:
			System.out.println("집 가기");
		}

	}

}

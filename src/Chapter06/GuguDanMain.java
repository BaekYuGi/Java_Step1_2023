package Chapter06;

import java.util.Scanner;

public class GuguDanMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GuguDan gd = new GuguDan();
		int num;
		
		System.out.print("출력할 단을 입력하세요 : ");
		num = scan.nextInt();
		
		gd.showTable(num);
		
		
	}

}

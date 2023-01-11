package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest16 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ 출력
		
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int s=scan.nextInt();
		int i,j,a;
		
		for(i=1; i<=s; i++) {
			for(j=s-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(a=1; a<=i; a++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

}

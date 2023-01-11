package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오
		
		Scanner scan=new Scanner(System.in);
		int a, cnt3=0, cnt5=0;
		String cn3 = "";
		String cn5 = "";
		System.out.println("10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오");
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"번째 숫자를 입력해주세요 : ");
			a=scan.nextInt();
			if(a%3==0) {
				cnt3++;
				cn3 += a+ " ";
			} else if(a%5==0) {
				cnt5++;
				cn5 += a+ " ";
			}
		}
		
		
		System.out.println("입력하신 수 중에 3의 배수는 "+cn3+"이고 총"+cnt3+"개입니다.");
		System.out.println("입력하신 수 중에 5의 배수는 "+cn5+"이고 총"+cnt5+"개입니다.");

	}

}

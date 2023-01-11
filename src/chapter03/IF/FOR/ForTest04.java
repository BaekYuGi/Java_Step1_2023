package chapter03.IF.FOR;

import java.awt.Container;

public class ForTest04 {

	public static void main(String[] args) {
		// 0 ~ 100까지의 수 중 홀수만 합하기
		
		int num;
		int total=0;
		
		for(num=0; num<=100; num++) {
			// 무시되는 수행문
			if(num%2==0)
				continue; //그냥 무시하세요 라는 뜻
			
			total += num;
		}
		
		System.out.println("0 ~ 100까지의 수 중 홀수만 합한 값은 "+total+"입니다.");
		
		System.out.println("=========================");
		System.out.println();
		System.out.println("1 ~ 20까지의 수 중 홀수값만 출력하시오");
		
		int num1;
		int total1=0;
		
		
		for(num1=1; num1<=20; num1++) {
			if(num1%2!=0)	{
				System.out.print(num1+" ");
			} 
			}
		 
			
		
		System.out.println("");
		System.out.println("1 ~ 20까지의 수 중 홀수만 합한 값은 "+total1+"입니다.");

	}

}

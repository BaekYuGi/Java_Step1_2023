package Chapter05;

import java.util.Scanner;

public class Method {
	

	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드
	
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//method1
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개 빵이 모두 완료되었습니다" );
	}//method2
	void makeBread(int count,String str) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 "+str+"빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 "+str+"빵이 모두 완료되었습니다" );
	}//method3
	
	void order(int a) {
		for(int i=0;i<a;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+a+"개의 빵이 모두 완료되었습니다" );
	}
	//order method
void order() {
	Scanner scan = new Scanner(System.in);
	boolean a = true;
	Method bread = new Method();
	while (a) {
		System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 :");
		System.out.print("선택> ");
		int b = scan.nextInt();
		String d;
		switch (b) {
		case 1:
			System.out.print("주문할 빵의 갯수 : ");
			int c = scan.nextInt();
			bread.order(c);
			break;
		case 2:
			System.out.print("주문할 빵의 갯수 : ");
			c = scan.nextInt();
			System.out.print("주문할 빵의 종류 : ");
			d = scan.next();
			bread.order(c, d);
			break;
		case 3:
			a = false;
			break;
		}
	}
	System.out.println("프로그램 종료");
}
	void order(int a, String b) {
	for(int i=0;i<a;i++) {
		System.out.println((i+1)+"번째 "+b+"빵을 만들었습니다");
	}
	System.out.println("요청하신 "+a+"개의 "+b+"빵이 모두 완료되었습니다" );
}	
}//order method
	
	
	
	
	
	
	


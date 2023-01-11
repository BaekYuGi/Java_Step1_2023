package chapter01;

public class BinaryTest2 {

	public static void main(String[] args) {
		//카멜기법 - 첫글자는 무조건 소문자 중간단어의 첫자는 대문자
		//파스칼기법 - 첫글자는 무조건 대문자
		
		int num=10;
		int bnum=0B1000; // B=Binary의 약자 즉 2진수(0B)
		int onum=010; // 8진수(OCT)
		
		int bnum2=0B10000;
		int hnum=0x10; //16진수(Hex) x=Hex의 약자
		
		System.out.println(num);
		System.out.println(bnum);
		System.out.println(onum);
		System.out.println(bnum2);
		System.out.println(hnum);

	}

}

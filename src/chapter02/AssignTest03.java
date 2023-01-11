package chapter02;

public class AssignTest03 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		System.out.println(+num1);
		System.out.println(-num2); //표시만 음수로 됨 실제로 -20이 된건 아님
		System.out.println(num2);
		
		num2=-num2; //실제로 음수로 바꿈
				
		System.out.println(num2);

	}

}

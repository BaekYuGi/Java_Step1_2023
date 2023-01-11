package chapter03.IF.FOR;

public class ForTest15 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			System.out.print("["+i+"단"+"]"+"\t");
		}
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int b=2; b<=9; b++) {
				System.out.print(b+"*"+i+"="+b*i+"\t");
			}
			System.out.println();
		}

	}

}

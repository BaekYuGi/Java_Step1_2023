package Chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		Start start = new Start();
		Scanner scan = new Scanner(System.in);

		int select;
		String check;

		while (true) {
			System.out.println("숫자를1 입력하세요");
			select = scan.nextInt();
			check = start.check(select);

			if (check.equals("SUCCESS")) {
				break;
			}

		}

	}

}

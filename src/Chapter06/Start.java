package Chapter06;

import java.util.Random;

public class Start {

	private int random = new Random().nextInt(50) + 1; // 1에서 50까지의 정수중 추출
	private int count = 0;
	private String result = "FAIL";

	public String check(int mynumber) {

		// random값보다 작으면 up / 크면 down / 일치하면 -> result = "SUCCESS"
		count++;
		if (mynumber > random) {
			System.out.println("DOWN");
			count++;
		} else if (mynumber < random) {
			System.out.println("UP");
			count++;
		} else {
			System.out.println("SUCCESS " + count + "만에 정답!");
			result = "SUCCESS";
		}

		return result;

	}

}

package chapter03.IF.SWITCH;

public class SwitchCase01 {

	public static void main(String[] args) {

        int ranking=2;
        char medalColor;
        
        switch (ranking) {
		case 1:
			medalColor='G';
			break;
		case 2:
			medalColor='S';
			break;
		case 3:
			medalColor='B';
		    break;

		default: // 나머지 value값
			medalColor='A';
			break; // default 는 제일 마지막 값이기 때문에 굳이 break를 걸어줄 필요는 없다
		}
        
        System.out.println(ranking +"등 메달은 "+medalColor+"입니다.");

	}

}

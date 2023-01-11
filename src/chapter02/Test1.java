package chapter02;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("1번 문제");
		byte bNum=10;
        int iNum=bNum;

        System.out.println(iNum);

        int iNum2=20;
        long lNum=iNum2;

        System.out.println(lNum);
        System.out.println("=================");
        System.out.println("2번 문제");
		
		float fNum=10.5f;
		var vNum=fNum;
		
		System.out.println((int)+vNum);
		
		Double dNum=1234.1234;
		var vNum2=dNum;
		
		System.out.println((int)+vNum2);
		System.out.println("=================");
		System.out.println("3번 문제");
		
		System.out.println("부동 소수점 방식 ( floating point )");
		System.out.println("=================");
		System.out.println("4번 문제");
		
		int iNum3=10;
		float fNum3=2.5f;
		
		System.out.println("iNum + fNum = " + (int)(iNum3+fNum3));
		System.out.println("iNum - fNum = " + (int)(iNum3-fNum3));
		System.out.println("iNum * fNum = " + (int)(iNum3*fNum3));
		System.out.println("iNum / fNum = " + (int)(iNum3/fNum3));
		
		System.out.println("=================");
		System.out.println("5번 문제");
		
		char ch1='\uAE00';
		
		System.out.println(ch1);
		

	}

}

package Chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1=new Korean("박자바","010-2340-5678");
		System.out.println("nation : "+k1.nation);
		System.out.println("name : "+k1.name);
		System.out.println("name : "+k1.ssn);
		System.out.println("-----------------------");
		Korean k2=new Korean("김자바","010-1234-5678");
		System.out.println("nation : "+k2.nation);
		System.out.println("name : "+k2.name);
		System.out.println("name : "+k2.ssn);
		
	}

}

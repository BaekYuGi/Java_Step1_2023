package Chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name="백유기");
		System.out.println(p.height=183f);
		System.out.println(p.weight=74);
		System.out.println("______________________");
		
		Person pp = new Person("강감찬");
		System.out.println(pp.name);
		System.out.println(pp.height=183f);
		System.out.println(pp.weight=74);
		System.out.println("______________________");
		
		Person ppp = new Person("이순신",174f,64);
		System.out.println(ppp.name);
		System.out.println(ppp.height);
		System.out.println(ppp.weight);
		
		
		
		
	}

}

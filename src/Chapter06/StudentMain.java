package Chapter06;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.studentName="김치";
		stu1.address="서울시 종로구";
		
		stu1.showStudentInfo();
		System.out.println("-----------------------------");
		
		//메소드를 이용하여 set
		Student stu2 = new Student();
		stu2.setStudentName("박수");
		stu2.setAddress("경기도 고양시");
		stu2.showStudentInfo();
		System.out.println("-----------------------------");
		
		//생성자 오버로딩으로 set
		Student stu3 = new Student("김치즈", "서울시 은평구");
		stu3.showStudentInfo(); 
		
	}

}

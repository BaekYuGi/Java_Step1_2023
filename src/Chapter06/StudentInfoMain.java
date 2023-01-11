package Chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo studentkim = new StudentInfo();
		studentkim.studentId=1234;
		studentkim.address="서울";
		studentkim.grade=3;
		
		studentkim.setStudentName("홍길동");
		String name = studentkim.getStudentName();
		
		System.out.println(name);
		
		
	}

}

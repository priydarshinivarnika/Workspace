
public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();

		//using setter method to assign value
		s1.setStudentId(1001);
		s1.setName("Jacoob");
		s1.setQualifyingExamMarks(80);
		s1.setResidentialStatus('H');
		s1.setYearOfEngg(3);
		System.out.println(s1);

		//using constructor to assign value
		Student s2 = new Student(1002, "Peter", 83, 'D', 2);

		System.out.println(s2);
	}
}

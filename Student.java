
public class Student {

	private int studentId;
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;

	public Student() {
	}
	//constructor to assign values at the time of object creation
	public Student(int studentId, String name, float qualifyingExamMarks, char residentialStatus, int yearOfEngg) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.yearOfEngg = yearOfEngg;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public char getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;

	}

	public int getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	// to convert char value to String type
	public String convertingResidentialStatus() {
		String status = "";
		switch (residentialStatus) {
		case 'H':
			status = "Hostellers";
			break;
		case 'D':
			status = "Day Scholar";
			break;

		default:
			status = "Invalid resident";
			break;
		}
		return status;
	}

	@Override
	public String toString() {
		return "Output: " + "\n\nStudent name : " + getName() + "\n" + "Student ID : " + getStudentId() + "\n" + "Qualifying Marks : "
				+ getQualifyingExamMarks() + "\n" + "Year of Engineering : " + getYearOfEngg() + "\n"
				+ "Residential Status : " + convertingResidentialStatus() + "\n";
	}

}

package week3.day1;

public class Students {

	// Description: Create multiple getStudentInfo() method by passing id argument
	// alone, by id & name, by email & phoneNumber

	public void getStudentInfo(int id) {

		System.out.println("StudentID -- " + id);
	}

	public void getStudentInfo(int id, String name) {

		System.out.println("StudentID -- " + id + ", StudentName -- " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {

		System.out.println("Student E-Mail --" + email + ", Student Phone-- " + phoneNumber);
	}

	public static void main(String[] args) {

		Students stud = new Students();
		stud.getStudentInfo(9788977);
		stud.getStudentInfo(9788977, "Livi");
		stud.getStudentInfo("livi@gmail.com", 978457854);

	}

}

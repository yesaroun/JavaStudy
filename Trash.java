public class Student
{
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName(){
		return studentName;
	}

	public void setStudentName(String name){
		studentName = name;
	}

	public static void main(String[] args){
		Student student = new Student();
		studentAhn.studentName = "�ȿ���";

		System.out.println(studentAhn.studentName);
		System.out.println(studnetAhn.getStudentName());
	}
}
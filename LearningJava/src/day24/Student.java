package day24;

public class Student {
	int stuId;
	int stuAge;
	String course;
	public static String faculty = "Navin";
	
	public void assign(int stuId,int stuAge, String course) {
		this.stuId = stuId;
		this.stuAge = stuAge;
		this.course = course;
		System.out.println(stuId);
		System.out.println(stuAge);
		System.out.println(course);
	}
public void display() {
	System.out.println(faculty);
	
}
}

package day19;

public class StudObject {

	public static void main(String[] args) {
		//Creating an Array of Student objects
		Student1[] students = new Student1[3];
		
		//Initialize the Student1 objects
		
		students[0] = new Student1("Esmadula", "07856456733", 79);
		students[1] = new Student1("John", "JohanDavid@gmail.com", 65);
		students[2] = new Student1("Alexander", "01732345654", 50);
		
		
		//Display the Student1 information
		
		for(Student1 student : students) {
			student1.display();
		}
	}

}

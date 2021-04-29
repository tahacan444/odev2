package odev2;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

		Course course1 = new Course(1, "Engin Demiroğ", 10, "Java");
		Course course2 = new Course(2, "Engin Demiroğ", 20, "C#");
		Course course3 = new Course(3,"Engin Demiroğ",30,"Python");
		
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.courseInformation(course3);
		System.out.println("----------");
		courseManager.courseInformation(course2);
		System.out.println("----------");
		courseManager.courseInformation(course1);
		System.out.println("----------");
		courseManager.instructorInformation(instructor);
		
		

	}

}

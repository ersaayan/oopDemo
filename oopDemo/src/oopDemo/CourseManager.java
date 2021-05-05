package oopDemo;

public class CourseManager {
	public void courseRegister(Course course, User user) {
		System.out.println(course.courseName+"; This user: "+user.username+", registered this course. Congratulations!");
	}
}

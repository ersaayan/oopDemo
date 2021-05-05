package oopDemo;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------");
		System.out.println("Kodlama.io");
		System.out.println("-----------");
		//Create category
		Category category1 = new Category(1, "Java");
		Category category2 = new Category(2, "C#");
		//Create category list
		Category[] categorys = {category1,category2};
		//Create course
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)", "Engin Demiroð");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java +React)", "Engin Demiroð");
		Course course3 = new Course(3, "Programlamaya Giriþ Temel Kurs", "Engin Demiroð");
		//Create courses list
		Course[] courses = {course1,course2,course3};
		//Create user
		User user1 = new User(1, "Ersaayan");
		User user2 = new User(2, "Ersaayan.py");
		//Create user list
		User[] users = {user1,user2};
		//Listing courses
		for (Course course : courses) {
			System.out.println("Course No: "+course.id);
			System.out.println("Course Name: "+course.courseName);
			System.out.println("Course Educator: "+course.courseEducator);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		//Listing categories
		for (Category category : categorys) {
			System.out.println("Category No: "+category.id);
			System.out.println("Category Name: "+category.courseName);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		//Listing users
		for (User user : users) {
			System.out.println("User No: "+user.id);
			System.out.println("Username: "+user.username);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		//Enrolling in courses with users
		CourseManager courseManager = new CourseManager();
		courseManager.courseRegister(course1,user1);
		
	}

}

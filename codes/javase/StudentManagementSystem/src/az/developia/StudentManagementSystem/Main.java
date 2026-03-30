package az.developia.StudentManagementSystem;

import az.developia.StudentManagementSystem.entity.Student;
import az.developia.StudentManagementSystem.repository.StudentRepository;

public class Main {
	public static void main(String[] args) {
		Student student = new Student(null, "aliimran", "aliyev", 12, "alliimran", "1234aliimran");
		StudentRepository repoystory = new StudentRepository();
		repoystory.add(student);
	}
}

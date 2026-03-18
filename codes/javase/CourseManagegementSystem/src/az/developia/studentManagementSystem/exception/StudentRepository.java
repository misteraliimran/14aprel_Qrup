package az.developia.studentManagementSystem.exception;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	private List<Student> students = new ArrayList<>();

	public boolean checkUser(String username) {
		for (Student s : students) {
			if (s.getUsername().equals(username)) {
				return false;
			}
		}
		return true;
	}

	public void register(Student student) {
		if (checkUser(student.getUsername())) {
			students.add(student);
			System.out.println("Qeydiyyat uğurludur");
		} else {
			System.out.println("Bu username artıq mövcuddur!");
		}
	}

	public boolean login(String username, String password) {
		for (Student s : students) {
			if (s.getUsername().equals(username) && s.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}
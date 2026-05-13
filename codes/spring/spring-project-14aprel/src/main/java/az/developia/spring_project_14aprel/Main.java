package az.developia.spring_project_14aprel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = context.getBean(Employee.class);

		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Age: " + employee.getAge());
		System.out.println("Salary: " + employee.getSalary());

//		System.out.println("Computer Brand: " + ((Object) employee.getComputer()).getBrand());
	}
}
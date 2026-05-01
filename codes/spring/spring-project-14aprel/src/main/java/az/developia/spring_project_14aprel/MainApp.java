package az.developia.spring_project_14aprel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Person p = (Person) context.getBean("person");

		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Salary: " + p.getSalary());

		String[] beans = context.getBeanDefinitionNames();

		System.out.println("\nBütün bean-lər:");
		for (String bean : beans) {
			System.out.println(bean);
		}
	}
}
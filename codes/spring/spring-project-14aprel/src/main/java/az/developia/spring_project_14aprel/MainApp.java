package az.developia.spring_project_14aprel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Home home1 = context.getBean(Home.class);
		System.out.println(home1);

		Home home2 = context.getBean(Home.class);
		System.out.println(home2);

		context.close();
	}
}
package az.developia.spring_project_14aprel;

import az.developia.spring_project_14aprel.controller.ComputerController;

public @interface WebMvcTest {

	Class<ComputerController> value();

}

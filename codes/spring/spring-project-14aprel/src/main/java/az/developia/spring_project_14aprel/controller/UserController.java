package az.developia.spring_project_14aprel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import az.developia.spring_project_14aprel.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public String create() {
        userService.createUserWithOrders();
        return "User və 3 Order əlavə olundu.";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "User və ona aid bütün Order-lər silindi.";
    }
}
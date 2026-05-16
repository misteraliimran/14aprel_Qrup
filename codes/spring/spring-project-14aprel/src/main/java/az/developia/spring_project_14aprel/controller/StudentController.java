package az.developia.spring_project_14aprel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    List<Student> students = new ArrayList<>();

    @GetMapping("/")
    public String showPage(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("students", students);

        return "students";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {

        students.add(student);

        return "redirect:/";
    }
}
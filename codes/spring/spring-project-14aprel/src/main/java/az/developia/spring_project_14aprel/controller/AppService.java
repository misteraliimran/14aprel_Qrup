package az.developia.spring_project_14aprel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private int version;

    @Value("${app.active}")
    private boolean active;

    public void showInfo() {
        System.out.println("App Name: " + name);
        System.out.println("App Version: " + version);
        System.out.println("App Active: " + active);
    }
}
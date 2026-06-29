package az.developia.spring_project_14aprel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_14aprel.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Long countAllUsers() {
        return userRepository.countAllUsers();
    }
}

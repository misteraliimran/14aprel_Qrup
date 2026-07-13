package az.developia.spring_project_14aprel.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_14aprel.User;
import az.developia.spring_project_14aprel.entity.Order;
import az.developia.spring_project_14aprel.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 1,2,3,4
    public void createUserWithOrders() {

        User user = new User();
        user.setLastName("Ali");
        user.setLastName("Imran");
        user.setUsername("ali123");
        user.setPassword("12345");
        user.setEmail("ali@gmail.com");

        Order order1 = new Order();
        order1.setOrderDate(LocalDate.now());
        order1.setTotalPrice(1500.0);
        order1.setStatus("NEW");

        Order order2 = new Order();
        order2.setOrderDate(LocalDate.now());
        order2.setTotalPrice(2200.0);
        order2.setStatus("NEW");

        Order order3 = new Order();
        order3.setOrderDate(LocalDate.now());
        order3.setTotalPrice(3500.0);
        order3.setStatus("NEW");

        user.addOrder(order1);
        user.addOrder(order2);
        user.addOrder(order3);

        userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
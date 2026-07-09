package az.developia.spring_project_14aprel.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate orderDate;

    private Double totalPrice;

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
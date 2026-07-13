package az.developia.spring_project_14aprel.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate orderDate;
    private Double totalPrice;
    private String status;

    @ManyToOne
    private User user;

	public void setTotalPrice(double d) {
		// TODO Auto-generated method stub
		
	}

	public void setOrderDate(LocalDate now) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setUser(User user2) {
		// TODO Auto-generated method stub
		
	}

}
package az.developia.spring_project_14aprel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="computers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int i) {
		// TODO Auto-generated method stub
		
	}
    
}
package edu.itstep.AWS.dto;
import java.time.LocalDateTime;
import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="users")
@Getter @Setter @NoArgsConstructor

public class UserDTO {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;
	@Column(name="first_name")
	private String firstName;
	@Column (name="last_name")
	private String lastName;
	@Column (name="address")
	private String address;
	@Column(name="age")
	private Integer age;
	@Column (name="created_date")
	private LocalDateTime createdDate;
	

 public UserDTO(long id, String firstName, String lastName, String address, int age) {
	    this.id = id;
	    this.address = address;
	    this.age = age;
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }
	
}

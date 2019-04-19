package be.g00glen00b.apps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String lastName;
	private String middleName;
	private String firstName;
	private LocalDate dateOfBirth;
	private Integer siblings;
	
	public User(Long id, String lastName, String middleName, String firstName, LocalDate dateOfBirth,
			Integer siblings) {
		
		this.id = id;
		this.lastName = lastName;
		this.middleName = middleName;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.siblings = siblings;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getSiblings() {
		return siblings;
	}
	public void setSiblings(Integer siblings) {
		this.siblings = siblings;
	}
	
}

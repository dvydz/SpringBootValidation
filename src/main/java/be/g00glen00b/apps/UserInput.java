package be.g00glen00b.apps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInput {
	@NotNull
	@Size(min = 1, max = 60)
	private String lastName;
	@Size(max = 60)
	private String middleName;
	@NotNull(message = "{user.firstName.notNull}")
	@Size(min = 1, max = 60, message = "{user.firstName.size}")
	private String firstName;
	@NotNull(message = "{user.dateOfBirth.")
	@Past(message = "{user.dateOfBirth.past}")
	@Adult(message = "{user.dateOfBirth.adult}")
	private LocalDate dateOfBirth;
	@NotNull
	@PositiveOrZero
	private Integer siblings;
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

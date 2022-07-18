package jana60.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String website;
	@Column(name = "head_of_department")
	private String head_of_department;
	@OneToMany
	@JoinColumn(name = "department_id")
	private List<Degrees> degrees;

	// getter e setter
	public Integer getCountryId() {
		return Id;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public List<Degrees> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<Degrees> degrees) {
		this.degrees = degrees;
	}

	public void setCountryId(Integer countryId) {
		this.Id = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHead_of_department() {
		return head_of_department;
	}

	public void setHead_of_department(String head_of_department) {
		this.head_of_department = head_of_department;
	}

}

package in.satya.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rId;
	private String rname;
	private String gender;
	
	@ManyToMany(mappedBy = "role")
	private List<Person1> person;

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}



	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Person1> getPerson() {
		return person;
	}

	public void setPerson(List<Person1> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Role [rId=" + rId + ", rname=" + rname + ", gender=" + gender + "]";
	}
	
	
	
	
	

}

package aatithya;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class Login {

	@Id
	@Column(name = "User_Name")
	private String name;
	@Column(name = "Password")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login() {

	}

	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

}

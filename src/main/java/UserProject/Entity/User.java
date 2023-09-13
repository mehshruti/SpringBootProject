package UserProject.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
@Builder
@ToString
@Entity
@Table(name = "UserDetails")
public class User {
    @Id
    @Column(name = "Id")
    private String Id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")
    private String email;

    public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "city")
    private String city;
}

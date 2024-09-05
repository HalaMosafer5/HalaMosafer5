package com.project.restaurant_review_application.models;

import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

//import com.project.restaurant_review_application.models.Reviews;


@Entity
@Table(name = "User")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser", updatable = false, nullable = false)
	private int idUser;


    @Column(name = "first_name", length = 45, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 45, nullable = false)
    private String lastName;

    @Column(name = "email", length = 128, nullable = false, unique = true)
    private String email;

    @Column(name = "User_name", length = 255, nullable = false, unique = true)
    private String username;

    @Column(name = "Created_at")
    private Date createdAt;

    @Column(name = "Updated_at")
    private Date updatedAt;

    @Column(name = "role", nullable = false)
    private boolean role; // Assuming role is a boolean for simplicity (true for admin, false for regular user)

    @Column(name = "password", length = 45, nullable = false)
    private String password;
    
    
        
	public Users() {
		super();
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Users [idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", role=" + role
				+ ", password=" + password + ", reviews=" +  "]";
	}

	
    
}

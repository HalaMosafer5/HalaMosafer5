package com.project.restaurant_review_application.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reviews")
public class Reviews {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idReviews", updatable = false, nullable = false)
	private int idReviews;


    @Column(name = "rating", nullable = false)
    private Double rating;

    @Column(name = "comments", columnDefinition = "LONGTEXT", nullable = true)
    private String comments;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "update_at")
  
    private Date updatedAt;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Restaurant_idRestaurant", nullable = false)
    private Restaurant restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_idUser", nullable = false)
    private Users user;



	@Override
	public String toString() {
		return "Reviews [idReviews=" + idReviews + ", rating=" + rating + ", comments=" + comments + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", restaurant=" + restaurant + ", user=" + user + "]";
	}

	public Reviews() {
		super();
	}
	

	public Reviews(int idReviews, Double rating, String comments, Date createdAt, Date updatedAt, Restaurant restaurant,
			Users user) {
		this.idReviews = idReviews;
		this.rating = rating;
		this.comments = comments;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.restaurant = restaurant;
		this.user = user;
	}

	public int getIdReviews() {
		return idReviews;
	}

	public void setIdReviews(int idReviews) {
		this.idReviews = idReviews;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

	@PreUpdate
    protected void onUpdate() {
        updatedAt = new Date();
    }
}

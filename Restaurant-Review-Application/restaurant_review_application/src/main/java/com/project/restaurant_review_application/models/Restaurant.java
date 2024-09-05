package com.project.restaurant_review_application.models;

import jakarta.persistence.*;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRestaurant", updatable = false, nullable = false)
	private int idRestaurant;


    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "address", columnDefinition = "LONGTEXT", nullable = false)
    private String address;

    @Column(name = "category", columnDefinition = "TEXT")
    private String category;

    @Column(name = "cuisine_type", length = 150)
    private String cuisineType;

    @Column(name = "contact_info", length = 45)
    private String contactInfo;

    @Column(name = "rate", nullable = true)
    private Double rate;

    @Column(name = "Img_Url", length = 45)
    private String imageUrl;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "opening_hours", nullable = true)
    private String openingHours;
    

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    

	@Override
	public String toString() {
		return "Restaurant [idRestaurant=" + idRestaurant + ", name=" + name + ", address=" + address + ", category="
				+ category + ", cuisineType=" + cuisineType + ", contactInfo=" + contactInfo + ", rate=" + rate
				+ ", imageUrl=" + imageUrl + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", openingHours="
				+ openingHours  + "]";
	}



	public Restaurant() {
		super();
	}



	public int getIdRestaurant() {
		return idRestaurant;
	}



	public void setIdRestaurant(int idRestaurant) {
		this.idRestaurant = idRestaurant;
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



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getCuisineType() {
		return cuisineType;
	}



	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}



	public String getContactInfo() {
		return contactInfo;
	}



	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}



	public Double getRate() {
		return rate;
	}



	public void setRate(Double rate) {
		this.rate = rate;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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



	public String getOpeningHours() {
		return openingHours;
	}



	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}


	@PreUpdate
    protected void onUpdate() {
        updatedAt = new Date();
    }



	public Object getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
}


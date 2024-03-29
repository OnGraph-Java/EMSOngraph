package com.eventManagement.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventId;

	@Column
	private Long adminId;

	@Column
	private String eventTitle;

	@Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime startDate;

	@Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime endDate;

	@Column
	private String eventCategory;

	@Column
	private String eventType;

	@Column
	private String userType;

	@Column
	private String location;

	@Column
	private String address;

	@Column
	private String link;

	@Column
	private String eventDetails;

	@Column
	private String imageName;
	
	@Column
	private Long eventRewardPoints;

	@Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdOn;
	
	@Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lastUpdated;
	
	@Column
	private boolean isActive;
	
	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getEventDetails() {
		return eventDetails;
	}

	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Event() {
		super();
	}

	public Event(Long adminId, String eventTitle, LocalDateTime startDate, LocalDateTime endDate, String eventCategory,
			String eventType, String userType, String location, String address, String link, String eventDetails,
			String imageName) {
		super();
		this.adminId = adminId;
		this.eventTitle = eventTitle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.eventCategory = eventCategory;
		this.eventType = eventType;
		this.userType = userType;
		this.location = location;
		this.address = address;
		this.link = link;
		this.eventDetails = eventDetails;
		this.imageName = imageName;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Long getEventRewardPoints() {
		return eventRewardPoints;
	}

	public void setEventRewardPoints(Long eventRewardPoints) {
		this.eventRewardPoints = eventRewardPoints;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}

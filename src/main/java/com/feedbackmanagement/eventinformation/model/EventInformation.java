package com.feedbackmanagement.eventinformation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EventInformation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6466642328915741815L;
	@Id
	@Column(name="_id")
	private String eventId;
	private String month;
	private String baseLocation;
	private String benificiaryName;
	private String venueAddress;
	private String councilName;
	private String project;
	private String category;
	private String eventName;
	private String eventDescription;
	private String eventDate;
	private Integer totalVolunteers;
	private float volunteerHours;
	private float travelHours;
	private float overallVolunteerHours;
	private Integer livesImpacted;
	private Integer activityType;
	private String status;
	private Integer pocId;
	private String pocName;
	private String pocContactNumber;
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getBenificiaryName() {
		return benificiaryName;
	}
	public void setBenificiaryName(String benificiaryName) {
		this.benificiaryName = benificiaryName;
	}
	public String getCouncilName() {
		return councilName;
	}
	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public float getVolunteerHours() {
		return volunteerHours;
	}
	public void setVolunteerHours(float volunteerHours) {
		this.volunteerHours = volunteerHours;
	}
	public float getTravelHours() {
		return travelHours;
	}
	public void setTravelHours(float travelHours) {
		this.travelHours = travelHours;
	}
	public Integer getLivesImpacted() {
		return livesImpacted;
	}
	public void setLivesImpacted(Integer livesImpacted) {
		this.livesImpacted = livesImpacted;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getVenueAddress() {
		return venueAddress;
	}
	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getTotalVolunteers() {
		return totalVolunteers;
	}
	public void setTotalVolunteers(Integer totalVolunteers) {
		this.totalVolunteers = totalVolunteers;
	}
	public float getOverallVolunteerHours() {
		return overallVolunteerHours;
	}
	public void setOverallVolunteerHours(float overallVolunteerHours) {
		this.overallVolunteerHours = overallVolunteerHours;
	}
	public Integer getActivityType() {
		return activityType;
	}
	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getPocId() {
		return pocId;
	}
	public void setPocId(Integer pocId) {
		this.pocId = pocId;
	}
	public String getPocName() {
		return pocName;
	}
	public void setPocName(String pocName) {
		this.pocName = pocName;
	}
	public String getPocContactNumber() {
		return pocContactNumber;
	}
	public void setPocContactNumber(String pocContactNumber) {
		this.pocContactNumber = pocContactNumber;
	}


}

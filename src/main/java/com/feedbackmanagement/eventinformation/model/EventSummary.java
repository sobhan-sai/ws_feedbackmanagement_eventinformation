package com.feedbackmanagement.eventinformation.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EventSummary {

	 private String eventId;
     private String baseLocation;
     private String beneficiaryName;
     private String councilName;
     private String eventName;
     private String eventDescription;
     private String eventDate;
     private Integer employeeId;
     private String employeeName;
     private float volunteerHours;
     private float travelHours;
     private Integer livesImpacted;
     private String businessUnit;
     private String status;
     private String iiepCategory;
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
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
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
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIiepCategory() {
		return iiepCategory;
	}
	public void setIiepCategory(String iiepCategory) {
		this.iiepCategory = iiepCategory;
	}
}

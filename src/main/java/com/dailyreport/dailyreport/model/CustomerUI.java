package com.dailyreport.dailyreport.model;

public class CustomerUI  {
 
		
	 private String firstName;
     private String lastName;
     private String date;
     private String statusDate;
     private String clientName;
     private String statsDate;
     protected CustomerUI() {
	}
 
	public CustomerUI(String firstName, String lastName, String date,String statusDate, String clientName,String statsDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.statusDate=statusDate;
		this.clientName=clientName;
		this.statsDate=statsDate;
		
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

	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	

	public String getStatsDate() {
		return statsDate;
	}

	public void setStatsDate(String statsDate) {
		this.statsDate = statsDate;
	}

	public String toString() {
		return String.format("Customer[firstName='%s', lastName='%s', date='%s',statusDate='%s',clientName='%s',statsDate='%s']", firstName, lastName, date,statusDate,clientName,statsDate);
	}
}
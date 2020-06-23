package com.dailyreport.dailyreport.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
 
	private static final long serialVersionUID = -2343243243242432341L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
	@Column(name = "firstname")
	private String firstName;
 
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "CreationDate")
	private String Date;
	
	@Column(name = "status_date")
	private String statusDate;
	
	@Column(name = "clientname")
	private String clientName;
	@Column(name = "stats_date")
	private String statsDate;
 
	protected Customer() {
	}
 
	public Customer(String firstName, String lastName, String date, String statusDate, String clientName,String statsDate  ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Date = date;
		this.statusDate= statusDate;
		this.clientName=clientName;
		this.statsDate=statsDate;
		
	}
 
	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s', Date='%s',statusDate='%s',clientName='%s',statsDate='%s']", id, firstName, lastName, Date,statusDate,clientName,statsDate);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDate() {
		return Date;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDate(String date) {
		this.Date = date;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
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






	
	
	
//	public String getFirstName() {
//        return firstName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public String getDate(String date) {
//        return Date;
//    }
//    public void setDate(String date) {
//        this.Date = date;
//    }
//    
    
}
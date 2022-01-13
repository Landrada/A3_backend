package com.example.A3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="aspirations")
public class Aspiration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String aspirationName;
	
	private String aspirationReason;
	
	private Date startDate;
	
	private Date completionDate;

	
	
	public Aspiration() {
	}

	
	public Aspiration(Long id, String aspirationName, String aspirationReason, Date startDate, Date completionDate) {
		super();
		this.id = id;
		this.aspirationName = aspirationName;
		this.aspirationReason = aspirationReason;
		this.startDate = startDate;
		this.completionDate = completionDate;
	}


	public Aspiration(String aspirationName, String aspirationReason, Date startDate, Date completionDate) {
		super();
		this.aspirationName = aspirationName;
		this.aspirationReason = aspirationReason;
		this.startDate = startDate;
		this.completionDate = completionDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAspirationName() {
		return aspirationName;
	}

	public void setAspirationName(String aspirationName) {
		this.aspirationName = aspirationName;
	}

	public String getAspirationReason() {
		return aspirationReason;
	}

	public void setAspirationReason(String aspirationReason) {
		this.aspirationReason = aspirationReason;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	
	
	
	
}

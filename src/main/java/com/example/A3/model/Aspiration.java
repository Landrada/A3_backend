package com.example.A3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="aspirations")
public class Aspiration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aspiration_id")
    private Long aspirationId;
	
	@Column(name="aspiration_name",nullable=false, unique=false)
	private String aspirationName;
	
	@Column(name="aspiration_reason",nullable=false, unique=false)
	private String aspirationReason;
	
	@Column(name="start_date",nullable=false, unique=false)
	private Date startDate;
	
	@Column(name="completion_date",nullable=false, unique=false)
	private Date completionDate;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn (name="category_id",referencedColumnName="id",nullable=false,unique=false)
	 private Category category;
	
	public Aspiration() {
	}

	
	public Aspiration(Long aspirationId, String aspirationName, String aspirationReason, Date startDate, Date completionDate) {
		super();
		this.aspirationId = aspirationId;
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

	public Aspiration(Long aspirationId, String aspirationName, String aspirationReason, Date startDate,
			Date completionDate, Category category) {
		super();
		this.aspirationId = aspirationId;
		this.aspirationName = aspirationName;
		this.aspirationReason = aspirationReason;
		this.startDate = startDate;
		this.completionDate = completionDate;
		this.category = category;
	}


	public Long getAspirationId() {
		return aspirationId;
	}


	public void setAspirationId(Long aspirationId) {
		this.aspirationId = aspirationId;
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

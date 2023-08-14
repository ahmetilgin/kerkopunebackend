package com.vvv.kerkopune.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private String slug;
	private String logo;
	private String www;
	private String twitter;
	private String linkedin;
	private Date createdAt;
	private String createdBy;
	private Boolean isActive;

}

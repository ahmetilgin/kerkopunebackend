package com.vvv.kerkopune.view.pub;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vvv.kerkopune.view.enums.POST_STATUS;
import com.vvv.kerkopune.view.enums.POST_TYPE;

public class Post {
	private String slug;
	private String position;
	private String description;
	private String applyUrl;
	private String applyEmail;
	private Location location;
	private POST_TYPE type;
	private POST_STATUS status;
	private Integer isFeatured;
	private Date createdAt;
	private Date updatedAt;
	private String postUrl;
	private Company company;
	private List<Tag> tags;

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("apply_url")
	public String getApplyUrl() {
		return applyUrl;
	}

	public void setApplyUrl(String applyUrl) {
		this.applyUrl = applyUrl;
	}

	@JsonProperty("apply_email")
	public String getApplyEmail() {
		return applyEmail;
	}

	public void setApplyEmail(String applyEmail) {
		this.applyEmail = applyEmail;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public POST_TYPE getType() {
		return type;
	}

	public void setType(POST_TYPE type) {
		this.type = type;
	}

	public POST_STATUS getStatus() {
		return status;
	}

	public void setStatus(POST_STATUS status) {
		this.status = status;
	}

	@JsonProperty("is_featured")
	public Integer getIsFeatured() {
		return isFeatured;
	}

	public void setIsFeatured(Integer isFeatured) {
		this.isFeatured = isFeatured;
	}

	@JsonProperty("created_at")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("post_url")
	public String getPostUrl() {
		return postUrl;
	}

	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}
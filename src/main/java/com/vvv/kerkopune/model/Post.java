package com.vvv.kerkopune.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;

import com.vvv.kerkopune.view.enums.POST_STATUS;
import com.vvv.kerkopune.view.enums.POST_TYPE;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String slug;
	private String position;
	private String description;
	private String applyUrl;
	private String applyEmail;
	@OneToOne(cascade = CascadeType.ALL)
	private Location location;
	@Basic
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private Integer type;
	private POST_TYPE postType;
	@Basic
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private Integer status;
	private POST_STATUS postStatus;
	private Integer isFeatured;
	private Date createdAt;
	private Date updatedAt;
	private String postUrl;
	@OneToOne(cascade = CascadeType.ALL)
	private Company company;
	@JoinTable
	@OneToMany(fetch = FetchType.EAGER)
	private List<Tag> tags;

	@PostLoad
	void fillTransient() {
		if (status > 0) {
			this.postStatus = POST_STATUS.fromString(status.toString());
		}

//		if (type > 0) {
//			this.postType = POST_TYPE.fromId(status);
//		}
	}

	@PrePersist
	void fillPersistent() {
		if (postStatus != null) {
			this.status = postStatus.getId();
		}

		if (postType != null) {
			this.type = postType.getId();
		}
	}
}

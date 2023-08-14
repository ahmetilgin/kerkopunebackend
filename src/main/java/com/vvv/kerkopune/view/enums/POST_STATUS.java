package com.vvv.kerkopune.view.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum POST_STATUS {
	DISAPPROVED(0, "ONAYLANMADI"), APPROVED(1, "ONAYLANDI"), UNPUBLISHED(2, "YAYINLANMADI");

	private Integer id;
	private String name;

	POST_STATUS(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@JsonCreator
    public static POST_STATUS fromString(@JsonProperty("status")String id) {
        if(id == null) return null;
        else {
        	for(POST_STATUS type:POST_STATUS.values()) {
        		if(type.getId().toString().equals(id))
        			return type;
        	}
        }
		return null;
    }
	
	@JsonValue
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

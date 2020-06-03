package com.core.entity;

import java.util.Date;

public class About {
	
	private Integer aboutId;
	
	private String aboutTitle;
	
	private String aboutText;
	
	private Date aboutDate;
	
	private Integer status;

	public Integer getAboutId() {
		return aboutId;
	}

	public void setAboutId(Integer aboutId) {
		this.aboutId = aboutId;
	}

	public String getAboutText() {
		return aboutText;
	}

	public void setAboutText(String aboutText) {
		this.aboutText = aboutText;
	}

	public Date getAboutDate() {
		return aboutDate;
	}

	public void setAboutDate(Date aboutDate) {
		this.aboutDate = aboutDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAboutTitle() {
		return aboutTitle;
	}

	public void setAboutTitle(String aboutTitle) {
		this.aboutTitle = aboutTitle;
	}
	
}
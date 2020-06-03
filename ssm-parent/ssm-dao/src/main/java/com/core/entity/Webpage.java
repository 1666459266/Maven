package com.core.entity;

import java.util.Date;

public class Webpage {
	
    private Integer webpageId;
    
    private String webpageTitle;

    private String webpageContent;

    private Date webpageCreateTime;

    private Date webpageModifyTime;
    
    private String webpageClassify;

    private Integer status;

    public Integer getWebpageId() {
        return webpageId;
    }

    public void setWebpageId(Integer webpageId) {
        this.webpageId = webpageId;
    }
    
    public String getWebpageTitle() {
        return webpageTitle;
    }

    public void setWebpageTitle(String webpageTitle) {
        this.webpageTitle = webpageTitle == null ? null : webpageTitle.trim();
    }

    public String getWebpageContent() {
        return webpageContent;
    }

    public void setWebpageContent(String webpageContent) {
        this.webpageContent = webpageContent == null ? null : webpageContent.trim();
    }
    
    public Date getWebpageCreateTime() {
        return webpageCreateTime;
    }

    public void setWebpageCreateTime(Date webpageCreateTime) {
        this.webpageCreateTime = webpageCreateTime;
    }

    public Date getwebpageModifyTime() {
        return webpageModifyTime;
    }

    public void setwebpageModifyTime(Date webpageModifyTime) {
        this.webpageModifyTime = webpageModifyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	public String getWebpageClassify() {
		return webpageClassify;
	}

	public void setWebpageClassify(String webpageClassify) {
		this.webpageClassify = webpageClassify;
	}

}
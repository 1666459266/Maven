package com.core.entity;

import java.util.Date;

public class Image {
	
    private Integer imageId;

    private String imageTitle;
    
    private String imageContent;

    private String imageUrl;

    private Date imageCreateTime;

    private Date imageModifyTime;

    private String imageTags;

    private Integer status;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle == null ? null : imageTitle.trim();
    }

    public String getImageContent() {
        return imageContent;
    }

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent == null ? null : imageContent.trim();
    }
    
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Date getImageCreateTime() {
        return imageCreateTime;
    }

    public void setImageCreateTime(Date imageCreateTime) {
        this.imageCreateTime = imageCreateTime;
    }

    public Date getImageModifyTime() {
        return imageModifyTime;
    }

    public void setImageModifyTime(Date imageModifyTime) {
        this.imageModifyTime = imageModifyTime;
    }

    public String getImageTags() {
        return imageTags;
    }

    public void setImageTags(String imageTags) {
        this.imageTags = imageTags == null ? null : imageTags.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
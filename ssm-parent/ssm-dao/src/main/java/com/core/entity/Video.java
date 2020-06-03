package com.core.entity;

import java.util.Date;

public class Video {
	
    private Integer videoId;

    private String videoTitle;

    private String videoContent;

    private String videoUrl;

    private Date videoCreateTime;

    private Date videoModifyTime;

    private String videoTags;

    private Integer status;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }

    public String getVideoContent() {
        return videoContent;
    }

    public void setVideoContent(String videoContent) {
        this.videoContent = videoContent == null ? null : videoContent.trim();
    }
    
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Date getVideoCreateTime() {
        return videoCreateTime;
    }

    public void setVideoCreateTime(Date videoCreateTime) {
        this.videoCreateTime = videoCreateTime;
    }

    public Date getVideoModifyTime() {
        return videoModifyTime;
    }

    public void setVideoModifyTime(Date videoModifyTime) {
        this.videoModifyTime = videoModifyTime;
    }

    public String getVideoTags() {
        return videoTags;
    }

    public void setVideoTags(String videoTags) {
        this.videoTags = videoTags == null ? null : videoTags.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
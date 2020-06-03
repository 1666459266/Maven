package com.core.entity;

import java.util.Date;

public class Resources {
		private Integer id;

	    private String backgroundUrl;

	    private Date backgroundCreateTime;

	    private Date backgroundModifyTime;

	    private String logoUrl;

	    private Date logoCreateTime;
	    
	    private Date logoModifyTime;

	    private Integer status;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getBackgroundUrl() {
			return backgroundUrl;
		}

		public void setBackgroundUrl(String backgroundUrl) {
			this.backgroundUrl = backgroundUrl;
		}

		public Date getBackgroundCreateTime() {
			return backgroundCreateTime;
		}

		public void setBackgroundCreateTime(Date backgroundCreateTime) {
			this.backgroundCreateTime = backgroundCreateTime;
		}

		public Date getBackgroundModifyTime() {
			return backgroundModifyTime;
		}

		public void setBackgroundModifyTime(Date backgroundModifyTime) {
			this.backgroundModifyTime = backgroundModifyTime;
		}

		public String getLogoUrl() {
			return logoUrl;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public Date getLogoCreateTime() {
			return logoCreateTime;
		}

		public void setLogoCreateTime(Date logoCreateTime) {
			this.logoCreateTime = logoCreateTime;
		}

		public Date getLogoModifyTime() {
			return logoModifyTime;
		}

		public void setLogoModifyTime(Date logoModifyTime) {
			this.logoModifyTime = logoModifyTime;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

}

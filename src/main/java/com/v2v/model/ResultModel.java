package com.v2v.model;

public class ResultModel {
	
	public ResultModel(CourierModelNew cmn, String status) {
		super();
		this.cmn = cmn;
		this.status = status;
	}
	public CourierModelNew cmn;
	public String status;
	public CourierModelNew getCmn() {
		return cmn;
	}
	public void setCmn(CourierModelNew cmn) {
		this.cmn = cmn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

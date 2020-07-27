package com.v2v.service;

import com.v2v.model.CourierModelNew;
import com.v2v.model.ResultModel;

public class ResultModelService {

	public ResultModel returnResult(CourierModelNew cmn,String status) {
		ResultModel rn = new ResultModel(cmn,status);
		return rn;
	}
	
}

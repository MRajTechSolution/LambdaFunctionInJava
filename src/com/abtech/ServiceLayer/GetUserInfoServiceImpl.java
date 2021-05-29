package com.abtech.ServiceLayer;

import com.abtech.Service.GetUserInfoService;

public class GetUserInfoServiceImpl {
	
	public void response(){
		GetUserInfoService getuserServiceInfo = () -> {
			System.out.println("Hello World");
		};
		getuserServiceInfo.getuserInfo();
	}
	
	

	
}

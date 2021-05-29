package com.abtech.MainClasss;

import com.abtech.ServiceLayer.GetUserInfoServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetUserInfoServiceImpl serviceResponse = new GetUserInfoServiceImpl();

		System.out.println("Working with github now");
		serviceResponse.response();

	}

}

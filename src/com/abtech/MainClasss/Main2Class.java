package com.abtech.MainClasss;

interface getDetails {

	void getDetailsServic();
}

public class Main2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDetails details = () -> {
			System.out.println("Hello");
		};

		details.getDetailsServic();

	}

}

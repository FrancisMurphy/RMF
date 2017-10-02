package com.frank.test;

import com.frank.RMF.RMFObject;

public class user extends RMFObject {

	private String name;
	private String age;

	public user(String id, String name,int age) {
		this.setClassName(this.getClassName());
		this.setObjectId(id);
		this.name = name;
		this.age = String.valueOf(age);

	}

	@Override
	public String toJSON() {

		return null;
	}

}

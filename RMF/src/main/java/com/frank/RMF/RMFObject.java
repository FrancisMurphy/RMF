package com.frank.RMF;

public abstract class RMFObject {

	protected String className;

	protected String objectId = "";

	public abstract String toJSON();

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}

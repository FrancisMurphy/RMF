package com.frank.RMF.core.event;

public class InsertPersistEvent extends BaseEvent{
	
	private Object targetObject;

	public InsertPersistEvent(Object targetObject,long sendTimeStamp) {
		super(sendTimeStamp);
		this.targetObject = targetObject;
	}

	public Object getTargetObject() {
		return targetObject;
	}

	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}

}

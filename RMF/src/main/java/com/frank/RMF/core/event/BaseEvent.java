package com.frank.RMF.core.event;

public abstract class BaseEvent {
	
	private long sendTimeStamp = -1;

	public BaseEvent(long sendTimeStamp) {
		this.sendTimeStamp = sendTimeStamp;
	}

	public long getSendTimeStamp() {
		return sendTimeStamp;
	}

	public void setSendTimeStamp(long sendTimeStamp) {
		this.sendTimeStamp = sendTimeStamp;
	}

}

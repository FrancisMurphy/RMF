package com.frank.test;

import com.frank.RMF.Manager.RMFBufferManager;

public class RMFTest {
	
	public static void main(String[] args) {
		RMFBufferManager bufferManager = new RMFBufferManager();
		bufferManager.init();
		bufferManager.insertObject(new user("1","1",1));
		
	}
	
		
}

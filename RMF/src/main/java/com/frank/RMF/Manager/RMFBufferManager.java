package com.frank.RMF.Manager;

import com.frank.RMF.core.Buffer.BufferJedisPool;

import redis.clients.jedis.Jedis;

public class RMFBufferManager {
	
	private BufferJedisPool bufferJedisPool;
	
	private Jedis mJedis;
	
	
	private boolean init() {
		
		bufferJedisPool = new BufferJedisPool();
		mJedis = bufferJedisPool.getJedisObject();
		
		return false;
	}

}

package com.frank.RMF.Manager;

import com.frank.RMF.RMFObject;
import com.frank.RMF.core.Buffer.BufferJedisPool;
import com.frank.RMF.tool.RMFTool;

import redis.clients.jedis.Jedis;

public class RMFBufferManager implements IRMFManager {

	private BufferJedisPool bufferJedisPool;

	private Jedis mJedis;

	public boolean init() {
		bufferJedisPool = new BufferJedisPool();
		mJedis = bufferJedisPool.getJedisObject();

		return true;
	}

	public boolean insertObject(RMFObject object) {

		if (null == mJedis || null == object || null == object.getObjectId()) {
			return false;
		}

		String objectValue = RMFTool.obj2JSON(object);
		
		synchronized (mJedis) {
			mJedis.set(object.getObjectId(), objectValue);
		}
		return true;

	}
	
	public void stopRedis() {
		bufferJedisPool.recycleJedisOjbect(mJedis);
	}

}

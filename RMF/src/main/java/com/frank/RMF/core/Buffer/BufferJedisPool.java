package com.frank.RMF.core.Buffer;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class BufferJedisPool {

	private static JedisPool pool;

	// 静态代码初始化池配置

	static {

		try {

			Properties props = new Properties();

			props.load(new FileInputStream("src/main/java/redis.properties"));

			// 创建jedis池配置实例

			JedisPoolConfig config = new JedisPoolConfig();

			// 设置池配置项值

			config.setMaxTotal((Integer.valueOf(props.getProperty("jedis.pool.maxtotal"))));

			config.setMaxIdle(Integer.valueOf(props.getProperty("jedis.pool.maxIdle")));

			config.setMaxWaitMillis(Long.valueOf(props.getProperty("jedis.pool.maxWait")));

			config.setTestOnBorrow(Boolean.valueOf(props.getProperty("jedis.pool.testOnBorrow")));

			config.setTestOnReturn(Boolean.valueOf(props.getProperty("jedis.pool.testOnReturn")));

			// 根据配置实例化jedis池

			pool = new JedisPool(config, props.getProperty("redis.ip"),
					Integer.valueOf(props.getProperty("redis.port")));

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	/** 获得jedis对象 */

	public static Jedis getJedisObject() {

		return pool.getResource();

	}

	/** 归还jedis对象 */

	public static void recycleJedisOjbect(Jedis jedis) {

		pool.returnResource(jedis);

	}
}

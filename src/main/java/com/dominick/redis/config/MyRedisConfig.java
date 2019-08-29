//package com.dominick.redis.config;
//
//import org.springframework.cache.CacheManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.cache.RedisCacheWriter;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializationContext;
//import org.springframework.data.redis.serializer.RedisSerializer;
//
//import java.net.UnknownHostException;
//import java.time.Duration;
//
///**
// * @author dominick
// * @2019/5/10 - 18:08
// * @function:
// */
//
////@Configuration
//public class MyRedisConfig {
//
//	/**
//	 *	将对象转换为Json的配置方法，不使用redis默认的序列化器，配置成为json的序列化器
//	 * @param redisConnectionFactory
//	 * @return	template
//	 * @throws UnknownHostException
//	 */
////	@Bean
////	public RedisTemplate<Object, Object> redisTemplate(
////			RedisConnectionFactory redisConnectionFactory) {
////		RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
////		template.setConnectionFactory(redisConnectionFactory);
////		Jackson2JsonRedisSerializer<Object> obj_jackson = new Jackson2JsonRedisSerializer(Object.class);
////		template.setDefaultSerializer(obj_jackson);
////		return template;
////	}
//
//	/**
//	 * 設置緩存管理器的序列化方式為json
//	 * @param redisConnectionFactory
//	 * @return
//	 */
//	@Bean
//	public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
//		//初始化一个RedisCacheWriter
//		RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory);
//		//设置CacheManager的值序列化方式为json序列化
//		RedisSerializer<Object> jsonSerializer = new GenericJackson2JsonRedisSerializer();
//		RedisSerializationContext.SerializationPair<Object> pair = RedisSerializationContext.SerializationPair
//				.fromSerializer(jsonSerializer);
//		RedisCacheConfiguration defaultCacheConfig=RedisCacheConfiguration.defaultCacheConfig()
//				.serializeValuesWith(pair);
//		//设置默认超过期时间是30秒
//		defaultCacheConfig.entryTtl(Duration.ofSeconds(30L));
//		//初始化RedisCacheManager
//		return new RedisCacheManager(redisCacheWriter, defaultCacheConfig);
//	}
//
//
//}

package com.dominick.redis.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author dominick
 * @2019/8/30 - 12:50
 * @function:
 */

@Component
public class MyKeyGenerator {

	@Bean("mykeyGenerator")
	public KeyGenerator keyGenerator() {
		return new KeyGenerator(){
			@Override
			public Object generate(Object o, Method method, Object... objects) {
				return method.getName() + '[' + Arrays.asList(objects).toString() +']';
			}
		};
	}
}

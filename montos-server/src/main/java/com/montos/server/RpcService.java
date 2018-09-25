package com.montos.server;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * RPC 服务注解（标注在服务实现类上）
 *
 * @author montos
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RpcService {

	/**
	 * 服务接口类
	 */
	Class<?> value();

	/**
	 * 服务版本号
	 */
	String version() default "";
}
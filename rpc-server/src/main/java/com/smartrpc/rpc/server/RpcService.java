package com.smartrpc.rpc.server;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * RPC 服务注解（标注在服务实现类上）
 *
 * @author gao shan
 * @since 1.0.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
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

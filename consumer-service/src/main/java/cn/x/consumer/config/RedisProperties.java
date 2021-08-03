package cn.x.consumer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xueqian_77
 */
@Component
@Data
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host;
    private int port;
}

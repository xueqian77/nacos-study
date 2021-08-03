package cn.x.consumer.controller;

import cn.x.consumer.config.RedisProperties;
import cn.x.consumer.feign.UserFeignApi;
import cn.x.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xueqian_77
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {


    @Autowired
    private RedisProperties redisProperties;

    @Autowired
    UserFeignApi userFeignApi;

    @GetMapping("/rest/{id}")
    public User consumerUserById(@PathVariable("id") Long id) {
        return userFeignApi.queryById(id);
    }

    @GetMapping("/hello")
    public RedisProperties disUserById() {
        return redisProperties;
    }
}

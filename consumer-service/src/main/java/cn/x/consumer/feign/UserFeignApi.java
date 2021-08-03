package cn.x.consumer.feign;

import cn.x.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



/**
 * @Description
 * @Author Guo Lixin
 * @date 2021/4/7 20:17
 */
@FeignClient("user-service")
public interface UserFeignApi {

    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") Long id);
}

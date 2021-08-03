package cn.x.user.web;

import cn.x.user.entity.User;
import cn.x.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;


    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {

        log.info("Server port is : " + port);

        User user = userService.queryById(id);

        return user;
    }
}

package cn.x.user.service;

import cn.x.user.entity.User;
import cn.x.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {

        System.out.println("UserService...");

        return userMapper.findById(id);
    }
}

package cn.x.user.mapper;

import cn.x.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Long id);
}

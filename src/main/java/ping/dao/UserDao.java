package ping.dao;

import org.apache.ibatis.annotations.Select;
import ping.domain.User;

import java.util.List;

/**
 * @author:lyp
 * @date 2020/1/10-23:21
 * 用户信息接口
 */
public interface UserDao {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}

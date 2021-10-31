package cloud.bearbiscuit.DancePlace.dao;


import cloud.bearbiscuit.DancePlace.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserDao {
    //插入用户
    int insertUser(User user);

    //查询用户
    User queryUser(int uid);

    //修改信息
    void updateUserPasswd(User user);

    List<User> selectUsers();

    void updateUserInf(User user);
}

package cloud.bearbiscuit.DancePlace.service.impl;


import cloud.bearbiscuit.DancePlace.dao.UserDao;
import cloud.bearbiscuit.DancePlace.domain.User;
import cloud.bearbiscuit.DancePlace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-04-05
 * @Description
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public List<User> queryUser() {
        return userDao.selectUsers();
    }

    @Override
    public boolean userLogin(User user){
        int uid = user.getUid();
        User verifyUser = userDao.queryUser(uid);
        return verifyUser.getUpasswd().equals(user.getUpasswd());
    }

    @Override
    public void userUpdatePasswd(User user){
        userDao.updateUserPasswd(user);
    }

    @Override
    public void updateUserInf(User user){
        userDao.updateUserInf(user);
    }
}

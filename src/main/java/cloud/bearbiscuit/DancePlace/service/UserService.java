package cloud.bearbiscuit.DancePlace.service;



import cloud.bearbiscuit.DancePlace.domain.User;

import java.util.List;


public interface UserService {

    void addUser(User user);
    boolean userLogin(User user);
    void userUpdatePasswd(User user);

    List<User> queryUser();

    void updateUserInf(User user);
}

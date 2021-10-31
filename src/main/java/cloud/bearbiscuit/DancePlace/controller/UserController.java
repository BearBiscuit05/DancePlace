package cloud.bearbiscuit.DancePlace.controller;

import cloud.bearbiscuit.DancePlace.commonUtils.Result;
import cloud.bearbiscuit.DancePlace.domain.User;
import cloud.bearbiscuit.DancePlace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-04-05
 * @Description
 */

@RestController
public class UserController {

    @Autowired()
    private UserService userService;

    //用户注册
    @RequestMapping("/userRegister")
    public Result userRegister(HttpServletRequest request){
        User user = new User();

        String username=request.getParameter("uname");
        String password=request.getParameter("upasswd");
        String PhoneNumber = request.getParameter("uphone");
        String uidentity = request.getParameter("uidentity");

        String uclubId = request.getParameter("uclubId");
        String ustudioId = request.getParameter("ustudioId");
        String ucity = request.getParameter("ucity");
        String uschool = request.getParameter("uschool");
        String upicture = request.getParameter("upicture");


        user.setUname(username);
        user.setUpasswd(password);
        user.setUidentity(Integer.parseInt(uidentity));
        user.setUphone(PhoneNumber);
        user.setUclubId(Integer.parseInt(uclubId));
        user.setUstudioId(Integer.parseInt(ustudioId));
        user.setUcity(ucity);
        user.setUschool(uschool);
        user.setUpicture(upicture);

        userService.addUser(user);
        return Result.ok().data("uid",user.getUid());
    }

    @RequestMapping("/userLogin")
    public Result userLogin(HttpServletRequest request){
        User user = new User();
        String uid=request.getParameter("uid");
        String password=request.getParameter("upasswd");

        user.setUpasswd(password);
        user.setUid(Integer.parseInt(uid));
        System.out.println("username is:"+uid);
        System.out.println("password is:"+password);

        boolean result = userService.userLogin(user);
        if (result)
            return Result.ok();
        else
            return Result.error();
    }

    @RequestMapping("/userUpdatePasswd")
    public String userUpdatePasswd(HttpServletRequest request){
        User user = new User();
        String uid=request.getParameter("uid");
        String oldPassword=request.getParameter("oldUpasswd");
        String newPassword=request.getParameter("newUpasswd");
        user.setUpasswd(oldPassword);
        user.setUid(Integer.parseInt(uid));
        //确认个人信息
        boolean result = userService.userLogin(user);
        if (result)
        {
            //进行修改
            user.setUpasswd(newPassword);
            userService.userUpdatePasswd(user);
            return "change success";
        }
        else
            return "error password";
    }

    @RequestMapping("/test")
    public Result test(){
        List<User> users = userService.queryUser();
        return Result.ok().data("items",users);
    }

    @RequestMapping("/updateUserInf")
    public Result updateUserInf(HttpServletRequest request){
        User user = new User();
        String uid=request.getParameter("uid");
        String username=request.getParameter("uname");
        String password=request.getParameter("upasswd");
        String PhoneNumber = request.getParameter("uphone");
        String uidentity = request.getParameter("uidentity");

        String uclubId = request.getParameter("uclubId");
        String ustudioId = request.getParameter("ustudioId");
        String ucity = request.getParameter("ucity");
        String uschool = request.getParameter("uschool");
        String upicture = request.getParameter("upicture");

        user.setUid(Integer.parseInt(uid));
        user.setUname(username);
        user.setUpasswd(password);
        user.setUidentity(Integer.parseInt(uidentity));
        user.setUphone(PhoneNumber);
        user.setUclubId(Integer.parseInt(uclubId));
        user.setUstudioId(Integer.parseInt(ustudioId));
        user.setUcity(ucity);
        user.setUschool(uschool);
        user.setUpicture(upicture);

        userService.updateUserInf(user);

        return Result.ok();
    }



}

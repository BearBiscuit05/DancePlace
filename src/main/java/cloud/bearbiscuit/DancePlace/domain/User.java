package cloud.bearbiscuit.DancePlace.domain;

import lombok.Data;

import java.util.Date;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-10-31
 * @Description
 */

@Data
public class User {
    private int uid;
    private String uname;
    private String upasswd;
    private String uphone;
    private int uidentity;
    /**
     * 身份状态确认
     * 0:管理员
     * 1:基础用户
     * 2：
     * 3:
     * 4:
     * 5:
     */
    private int uclubId;
    private int ustudioId;
    private String ucity;
    private String uschool;
    private String upicture;
}

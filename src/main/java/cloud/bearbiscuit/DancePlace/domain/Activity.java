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
public class Activity {
    private int uid;
    private int aid;
    private String acontext;
    private String apicture;
    private String alike;
    private String acity;
    private String acomment;
    private Date atime;
}

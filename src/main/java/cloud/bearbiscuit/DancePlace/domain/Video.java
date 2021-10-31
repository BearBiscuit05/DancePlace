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
public class Video {
    private int uid;
    private int vid;
    private String vname;
    private String vurl;
    private String vlike;
    private String vcomment;
    private String vcover;
    private Date vtime;
    private String vhot;
    private String vcity;
}

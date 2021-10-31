package cloud.bearbiscuit.DancePlace.domain;

import lombok.Data;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-10-31
 * @Description
 */

@Data
public class Talk {
    private int tid;
    private int uid1;
    private int uid2;
    private String tcontext;

}

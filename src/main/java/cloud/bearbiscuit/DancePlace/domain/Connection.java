package cloud.bearbiscuit.DancePlace.domain;

import lombok.Data;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-10-31
 * @Description
 */

@Data
public class Connection {
    private int follower;
    private int followed;
    private int connectionId;
}

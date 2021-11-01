package cloud.bearbiscuit.DancePlace.dao;


import cloud.bearbiscuit.DancePlace.domain.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ActivityDao {

    int insertActivity(Activity activity);

    Activity queryActivity(int aid);

    List<Activity> selectActivities();

    void updateActivityInf(Activity Activity);
}

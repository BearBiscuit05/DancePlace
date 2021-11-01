package cloud.bearbiscuit.DancePlace.dao;


import cloud.bearbiscuit.DancePlace.domain.Studio;
import cloud.bearbiscuit.DancePlace.domain.Talk;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface StudioDao {

    int insertStudio(Studio studio);

    Studio queryStudio(int sid);

    List<Studio> selectStudios();

    void updateStudioInf(Studio studio);
}

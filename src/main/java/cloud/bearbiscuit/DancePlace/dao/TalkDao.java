package cloud.bearbiscuit.DancePlace.dao;


import cloud.bearbiscuit.DancePlace.domain.Club;
import cloud.bearbiscuit.DancePlace.domain.Talk;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface TalkDao {

    int insertTalk(Talk talk);

    Talk queryClub(int tid);

    List<Talk> selectTalks();

    void updateTalkInf(Talk talk);
}

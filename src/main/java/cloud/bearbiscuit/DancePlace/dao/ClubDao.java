package cloud.bearbiscuit.DancePlace.dao;


import cloud.bearbiscuit.DancePlace.domain.Club;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ClubDao {

    int insertClub(Club club);

    Club queryClub(int uid);

    List<Club> selectClubs();

    void updateClubInf(Club club);
}

package cloud.bearbiscuit.DancePlace.service;



import cloud.bearbiscuit.DancePlace.domain.Club;
import cloud.bearbiscuit.DancePlace.domain.User;

import java.util.List;


public interface ClubService {

    void addClub(Club club);

    List<Club> selectClubs();

    Club queryClub(int cid);

    void updateClubInf(Club club);
}

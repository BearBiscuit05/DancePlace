package cloud.bearbiscuit.DancePlace.service.impl;


import cloud.bearbiscuit.DancePlace.dao.ClubDao;
import cloud.bearbiscuit.DancePlace.dao.UserDao;
import cloud.bearbiscuit.DancePlace.domain.Club;
import cloud.bearbiscuit.DancePlace.domain.User;
import cloud.bearbiscuit.DancePlace.service.ClubService;
import cloud.bearbiscuit.DancePlace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-04-05
 * @Description
 */

@Service("clubService")
@Transactional
public class ClubServiceImpl implements ClubService {

    @Autowired
    private ClubDao clubDao;


    @Override
    public void addClub(Club club) {
        clubDao.insertClub(club);
    }

    @Override
    public Club queryClub(int cid) {
        return clubDao.queryClub(cid);
    }

    @Override
    public void updateClubInf(Club club){
        clubDao.updateClubInf(club);
    }

    @Override
    public List<Club> selectClubs() {
        return clubDao.selectClubs();
    }
}

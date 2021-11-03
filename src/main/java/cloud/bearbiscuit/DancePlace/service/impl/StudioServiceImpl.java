package cloud.bearbiscuit.DancePlace.service.impl;


import cloud.bearbiscuit.DancePlace.dao.StudioDao;
import cloud.bearbiscuit.DancePlace.dao.UserDao;
import cloud.bearbiscuit.DancePlace.domain.Studio;
import cloud.bearbiscuit.DancePlace.domain.User;
import cloud.bearbiscuit.DancePlace.service.StudioService;
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

@Service("studioService")
@Transactional
public class StudioServiceImpl implements StudioService {

    @Autowired
    private StudioDao studioDao;


    @Override
    public void addStudio(Studio studio) {
        studioDao.insertStudio(studio);
    }

    @Override
    public Studio queryStudio(int sid) {
        return studioDao.queryStudio(sid);
    }

    @Override
    public void updateStudioInf(Studio studio){
        studioDao.updateStudioInf(studio);
    }

    @Override
    public List<Studio> selectStudios() {
        return studioDao.selectStudios();
    }
}

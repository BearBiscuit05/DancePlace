package cloud.bearbiscuit.DancePlace.service;



import cloud.bearbiscuit.DancePlace.domain.Studio;
import cloud.bearbiscuit.DancePlace.domain.User;

import java.util.List;


public interface StudioService {

    void addStudio(Studio studio);

    Studio queryStudio(int sid);

    List<Studio> selectStudios();

    void updateStudioInf(Studio studio);
}

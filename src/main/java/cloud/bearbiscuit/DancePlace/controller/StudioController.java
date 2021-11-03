package cloud.bearbiscuit.DancePlace.controller;

import cloud.bearbiscuit.DancePlace.commonUtils.Result;
import cloud.bearbiscuit.DancePlace.domain.Club;
import cloud.bearbiscuit.DancePlace.domain.Studio;
import cloud.bearbiscuit.DancePlace.domain.User;
import cloud.bearbiscuit.DancePlace.service.StudioService;
import cloud.bearbiscuit.DancePlace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-04-05
 * @Description
 */

@RestController
public class StudioController {

    @Autowired()
    private StudioService studioService;

    //用户注册
    @RequestMapping("/studioRegister")
    public Result studioRegister(HttpServletRequest request){
        Studio studio = new Studio();
        String uid = request.getParameter("uid");
        String sname=request.getParameter("sname");
        String scity = request.getParameter("scity");
        String sphone = request.getParameter("sphone");
        String spicture = request.getParameter("spicture");
        String sintroduce = request.getParameter("sintroduce");
        String suids = request.getParameter("suids");

        studio.setUid(Integer.parseInt(uid));
        studio.setSname(sname);
        studio.setScity(scity);
        studio.setSphone(sphone);
        studio.setSpicture(spicture);
        studio.setSintroduce(sintroduce);
        studio.setSuids(suids);

        studioService.addStudio(studio);
        return Result.ok().data("sid",studio.getSid());
    }




    @RequestMapping("/updateStudioInf")
    public Result updateStudioInf(HttpServletRequest request){
        Studio studio = new Studio();
        String sid = request.getParameter("sid");
        String uid = request.getParameter("uid");
        String sname=request.getParameter("sname");
        String scity = request.getParameter("scity");
        String sphone = request.getParameter("sphone");
        String spicture = request.getParameter("spicture");
        String sintroduce = request.getParameter("sintroduce");
        String suids = request.getParameter("suids");

        studio.setSid(Integer.parseInt(sid));
        studio.setUid(Integer.parseInt(uid));
        studio.setSname(sname);
        studio.setScity(scity);
        studio.setSphone(sphone);
        studio.setSpicture(spicture);
        studio.setSintroduce(sintroduce);
        studio.setSuids(suids);

        studioService.updateStudioInf(studio);
        return Result.ok();
    }

    @RequestMapping("/queryStudio")
    public Result queryStudio(HttpServletRequest request){

        Studio studio = studioService.queryStudio(Integer.parseInt(request.getParameter("sid")));
        return Result.ok().data("studio",studio);
    }

    @RequestMapping("/selectStudios")
    public Result selectClubs(HttpServletRequest request){
        List<Studio> studios = studioService.selectStudios();
        return Result.ok().data("studios",studios);
    }



}

package cloud.bearbiscuit.DancePlace.controller;

import cloud.bearbiscuit.DancePlace.commonUtils.Result;
import cloud.bearbiscuit.DancePlace.domain.Club;
import cloud.bearbiscuit.DancePlace.domain.User;
import cloud.bearbiscuit.DancePlace.service.ClubService;
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
public class ClubController {

    @Autowired()
    private ClubService clubService;

    //用户注册
    @RequestMapping("/clubRegister")
    public Result clubRegister(HttpServletRequest request){
        Club club = new Club();

        String uid=request.getParameter("uid");
        String PhoneNumber = request.getParameter("cphone");
        String ccity = request.getParameter("ccity");
        String cname = request.getParameter("cname");
        String cschool = request.getParameter("uschool");
        String cpicture = request.getParameter("cpicture");
        String cintroduce = request.getParameter("cintroduce");
        String cuids = request.getParameter("cuids");

        club.setUid(Integer.parseInt(uid));
        club.setCphone(PhoneNumber);
        club.setCcity(ccity);
        club.setCname(cname);
        club.setCschool(cschool);
        club.setCpicture(cpicture);
        club.setCintroduce(cintroduce);
        club.setCuids(cuids);

        clubService.addClub(club);
        return Result.ok().data("cid",club.getCid());
    }


    @RequestMapping("/updateClubInf")
    public Result updateClubInf(HttpServletRequest request){
        Club club = new Club();

        String uid=request.getParameter("uid");
        String cid=request.getParameter("cid");
        String PhoneNumber = request.getParameter("cphone");
        String ccity = request.getParameter("ccity");
        String cschool = request.getParameter("uschool");
        String cpicture = request.getParameter("cpicture");
        String cname = request.getParameter("cname");
        String cintroduce = request.getParameter("cintroduce");
        String cuids = request.getParameter("cuids");

        club.setUid(Integer.parseInt(uid));
        club.setCid(Integer.parseInt(cid));
        club.setCphone(PhoneNumber);
        club.setCname(cname);
        club.setCcity(ccity);
        club.setCschool(cschool);
        club.setCpicture(cpicture);
        club.setCintroduce(cintroduce);
        club.setCuids(cuids);

        clubService.updateClubInf(club);

        return Result.ok();
    }

    @RequestMapping("/queryClub")
    public Result queryClub(HttpServletRequest request){

        Club club = clubService.queryClub(Integer.parseInt(request.getParameter("cid")));
        return Result.ok().data("club",club);
    }

    @RequestMapping("/selectClubs")
    public Result selectClubs(HttpServletRequest request){
        List<Club> clubs = clubService.selectClubs();
        return Result.ok().data("clubs",clubs);
    }


}

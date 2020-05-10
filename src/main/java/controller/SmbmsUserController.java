package controller;

import entity.SmbmsUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.SmbmsUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * (SmbmsUser)表控制层
 *
 * @author makejava
 * @since 2020-04-28 00:17:28
 */
@Controller
public class SmbmsUserController {
    /**logger*/

    /**
     * 服务对象
     */
    @Resource
    private SmbmsUserService smbmsUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SmbmsUser selectOne(Long id) {
        return this.smbmsUserService.queryById(id);
    }
    /*登录业务控制*/
    @RequestMapping(value="/longin",method =RequestMethod.POST)
    public String login(@RequestParam  String userCode,
             @RequestParam String userPassword, HttpSession session, Model model){
      //  ModelAndView modelAndView=new ModelAndView();

        SmbmsUser user=smbmsUserService.queryByUserCode(userCode);
            if (user!=null&&user.getUserpassword().equals(userPassword)){
                session.setAttribute("users",user);
                System.out.println("执行login方法"+user.getUsername()+user.getUserpassword());
                return "frame";
            }else {
                model.addAttribute("error","用户名或密码错误");
                System.out.println("++++++++++++++++++===================+");
                return "login";
            }
         /*   if (user!=null){
               if (user.getUserpassword().equals(userPassword)){
                   modelAndView.addObject("Httpsession",user);
                   modelAndView.setViewName("frame");
                   return modelAndView;
               }else {
                   modelAndView.addObject("Httpsession","用户名或密码错误");
                   modelAndView.setViewName("login");
                   return modelAndView;
               }
            }else {
                modelAndView.addObject("用户名或密码错误");
                modelAndView.setViewName("login");
                return modelAndView;
            }*/

    }
    @RequestMapping("/userlist")
    public ModelAndView userList(String pageNo,String pageSize){
        /*创建模型数据对象*/
        ModelAndView modelAndView=new ModelAndView();
        /*解析前端传来的数据*/
        int offset=Integer.parseInt(pageNo);
        int limit=Integer.parseInt(pageSize);
        /*传到业务层用List接收*/
        List<SmbmsUser> userlist= smbmsUserService.queryAllByLimit(offset,limit);
        modelAndView.addObject(userlist);
        modelAndView.setViewName("userlist");
        return modelAndView;
    }
}
package com.yefeng.springtest.Admin.controller;

import com.yefeng.springtest.Admin.entity.Advertise;
import com.yefeng.springtest.Admin.service.AdvertiseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class MainController1 {
private final static String  ADMIN_PATH="admin";




    @Resource
    private AdvertiseService advertiseService;

    @RequestMapping("/advertising")
    public ModelAndView advertise(){
        ModelAndView view = new ModelAndView();
        view.setViewName(ADMIN_PATH+"/"+"advertising");
        List<Advertise> Ads_list = advertiseService.getAllAds();

        view.addObject("Ads_list",Ads_list);
        view.addObject("Ads_count",Ads_list.size());

        System.out.println(view);

        return view;
    }

//    @RequestMapping("/{parm}")
//    public String parm(@PathVariable(name = "parm")String parm){
//        System.out.println(parm);
//        String path = ADMIN_PATH + '/' + parm;
//        return path;
//    }

    @RequestMapping("login")
    public String login(){
        return "admin/login";
    }
    @RequestMapping("index")
    public String index(){
        return "admin/index";
    }
    @RequestMapping("home")
    public String home(){
        return "admin/home";
    }
    @RequestMapping("systemts")
    public String systemts(){
        return "admin/systems";
    }
    @RequestMapping("order_Chart")
    public String order_Chart(){
        return "admin/order_Chart";
    }
    @RequestMapping("sort_ads")
    public String sort_ads(){
        return "admin/sort_ads";
    }

}

package com.qf.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
@Controller
public class ManagerAction {

    //页面跳转:通过restful风格得到请求的动态地质
    @RequestMapping("/{page}")
    public String goToPage(@PathVariable String page){
        return page;//返回页面的动态地址
    }
}

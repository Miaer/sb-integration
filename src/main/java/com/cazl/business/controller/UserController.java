//--------------------------------------------------------------------
// 日期：2019/7/8 17:47
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.business.controller;

import com.cazl.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/insert")
    @ResponseBody
    public String userInsert() {
        System.out.println("userInsert .............");
        return "userInsert OK";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String userDelete() {
        System.out.println("userDelete .............");
        return "userDelete  OK";
    }

    /**
     * 静态页面访问
     * http://localhost:8888/staticPage.html 直接访问页面，无需经过dispatch
     * @param request
     * @return
     */
    @RequestMapping("/staticIndex")
    public String toStaticIndex(HttpServletRequest request){
        request.setAttribute("staticKey","staticPage");
        return "staticPage";
    }

    /**
     * 动态页面访问
     * @param request
     * @return
     */
    @RequestMapping("/dynamicIndex")
    public String toDynamicIndex(HttpServletRequest request){
        request.setAttribute("dynamicKey","dynamicKey");
        return "dynamicPage" ;
    }


    /**
     * 线程池测试
     * @param request
     * @return
     */
    @RequestMapping("/exPool")
    @ResponseBody
    public String exPool(HttpServletRequest request) throws InterruptedException {
        userService.poolTest();
        return "123" ;
    }
}

package cn.lx.bm.action;

import dp.web.BaseAction;
import cn.lx.bm.model.User;
import cn.lx.bm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.http.HttpRequest;
import com.google.gson.JsonArray;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("user")
public class UserAction extends BaseAction{
    @Autowired
    UserService userService;
    
    @RequestMapping("")
    public ModelAndView index(HttpServletRequest request){
    	List<User> list = userService.query(null);
    	request.setAttribute("list", JSON.toJSON(list).toString());
    	return new ModelAndView("index");
    }
}
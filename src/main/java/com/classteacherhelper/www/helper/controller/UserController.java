package com.classteacherhelper.www.helper.controller;

import com.classteacherhelper.www.helper.bean.Constant;
import com.classteacherhelper.www.helper.bean.ReturnResult;
import com.classteacherhelper.www.helper.bean.User;
import com.classteacherhelper.www.helper.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;

/**
 * 用户请求处理类
 */
@RestController
public class UserController {

    private static final Logger LOG = Logger.getLogger(UserService.class);

    @Resource private UserService userService;

    /**
     * 用户登录处理
     * @param user
     * @return
     */
    @RequestMapping(value = "/userLogin")
    public ReturnResult login(User user){

        LOG.debug("-----------用户登录开始----"+user+"----------");
        User loginUser = userService.findUser(user);
        LOG.debug("-----------用户登录结束----------");
        if(loginUser == null){
            return new ReturnResult(2,"用户不存在或密码错误",loginUser);
        }else {
            return new ReturnResult(1,"登录成功",loginUser);
        }

    }

    /**
     * 用户注销处理
     * @return
     */
    @RequestMapping(value = "/userExit")
    public ReturnResult exit(){

        LOG.debug("-----------用户登出开始------------");
        //按理来说应该在这里取消用户登陆凭证的时效  或者设置用户账户失效
        LOG.debug("-----------用户登出结束------------");
        return new ReturnResult(1,"注销成功",null);
    }

    /**
     * 用户的添加注册
     * 用户分为学生、教师、管理员
     * 辨别不同身份后继续填写表单
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser")
    public ReturnResult addUser(User user){

        //合法性检查
        if(StringUtils.isEmpty(user)){
            return new ReturnResult(2,"非法参数",null);
        }
        //判断用户的角色类别
        if(user.getRole_type() == Constant.ROLE_STUDENT){
            //学生
            return null;
        }
        if(user.getRole_type() == Constant.ROLE_STUDENT){
            //老师
            return null;
        }
        if(user.getRole_type() == Constant.ROLE_STUDENT){
            //管理员
            return null;
        }
        return new ReturnResult(1,"注册成功",new User());
    }

}

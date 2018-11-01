package cn.duanshaojie.swaggerui.controller;

import cn.duanshaojie.swaggerui.entity.User;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * <p><b>类名:</b> UserAction.java</p>
 * <p><b>标题:</b> 用户相关</p>
 * <p>描述: </p>
 * <p>时间: 2018年10月31日 16点50分</p>
 * <p>
 * 桃之夭夭,灼灼其华
 * @author edison
 */
@Api(value = "UserAction", description = "用户相关的接口")
@Controller
@RequestMapping("/user/")
public class UserAction {

    @ApiOperation(value = "用户注册", notes = "根据信息注册用户")
    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    @ResponseBody
    public String login(HttpServletRequest request, @ApiParam(value = "用户信息", required = true) User user){
        if (null == user) {
            return "用户信息不能为空";
        }

        if (StringUtils.isEmpty(user.getNickName())) {
            user.setNickName((int)Math.random()*1000+"");
        }

        return user.getNickName()+"恭喜你注册成功";
    }

    @ApiOperation(value = "发送短信", notes = "根据手机号码发送短信")
    @ApiImplicitParam(name = "mobile", value = "手机号码", paramType = "path", required = true, dataType = "String")
    @RequestMapping(value = "/send/{mobile}",method = {RequestMethod.GET})
    @ResponseBody
    public String login(@PathVariable String mobile){
        if (StringUtils.isEmpty(mobile)) {
            return "input mobile is null";
        }

        return mobile+"-发送成功";
    }

}

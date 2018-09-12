package com.wizinno.music.config.secutiry.jwt;

import com.wizinno.music.common.utils.ResponseUtil;
import com.wizinno.music.exception.LoginFailLimitException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Liumei
 */
@Slf4j
@Component
public class AuthenticationFailHandler extends SimpleUrlAuthenticationFailureHandler {

//    @Value("${music.loginTimeLimit}")
//    private Integer loginTimeLimit;

//    @Value("${music.loginAfterTime}")
//    private Integer loginAfterTime;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) {

        if (e instanceof UsernameNotFoundException || e instanceof BadCredentialsException) {
            String username = request.getParameter("username");
//            recordLoginTime(username);
//            String key = "loginTimeLimit:" + username;
//            String value = redisTemplate.opsForValue().get(key);
//            if (StrUtil.isBlank(value)) {
//                value = "0";
//            }
//            //获取已登录错误次数
//            int loginFailTime = Integer.parseInt(value);
//            int restLoginTime = loginTimeLimit - loginFailTime;
//            log.info("用户" + username + "登录失败，还有" + restLoginTime + "次机会");
            ResponseUtil.out(response, ResponseUtil.resultMap(false, 500, "用户名或密码错误"));
        } else if (e instanceof DisabledException) {
            ResponseUtil.out(response, ResponseUtil.resultMap(false, 500, "账户被禁用，请联系管理员"));
        } else if (e instanceof LoginFailLimitException) {
            ResponseUtil.out(response, ResponseUtil.resultMap(false, 500, ((LoginFailLimitException) e).getMsg()));
        } else {
            ResponseUtil.out(response, ResponseUtil.resultMap(false, 500, "登录失败"));
        }
    }

    /**
     * 判断用户登陆错误次数
     */
    public boolean recordLoginTime(String username) {

        String key = "loginTimeLimit:" + username;
        String flagKey = "loginFailFlag:" + username;
//        String value = redisTemplate.opsForValue().get(key);
//        if (StrUtil.isBlank(value)) {
//            value = "0";
//        }
        //获取已登录错误次数
//        int loginFailTime = Integer.parseInt(value) + 1;
//        redisTemplate.opsForValue().set(key, String.valueOf(loginFailTime), loginAfterTime, TimeUnit.MINUTES);
//        if (loginFailTime >= loginTimeLimit) {
//            redisTemplate.opsForValue().set(flagKey, "fail", loginAfterTime, TimeUnit.MINUTES);
//            return false;
//        }
        return true;
    }
}

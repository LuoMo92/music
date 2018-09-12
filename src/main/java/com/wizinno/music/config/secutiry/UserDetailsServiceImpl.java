package com.wizinno.music.config.secutiry;

import com.wizinno.music.domain.User;
import com.wizinno.music.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author Liumei
 */
@Slf4j
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

//    @Value("${music.loginAfterTime}")
//    private Integer loginAfterTime;

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String flagKey = "loginFailFlag:"+username;
//        String value = redisTemplate.opsForValue().get(flagKey);
//        if(StrUtil.isNotBlank(value)){
//            //超过限制次数
//            throw new LoginFailLimitException("登录错误次数超过限制，请"+loginAfterTime+"分钟后再试");
//        }
        User user = userService.findByUsername(username);
        return new SecurityUserDetails(user);
    }
}

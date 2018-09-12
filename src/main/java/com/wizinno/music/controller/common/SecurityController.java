package com.wizinno.music.controller.common;

import com.wizinno.music.common.utils.ResultUtil;
import com.wizinno.music.common.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liumei
 */
@Slf4j
@RestController
@Api(description = "Security相关接口")
@RequestMapping("/api/common")
public class SecurityController {

    @RequestMapping(value = "/needLogin", method = RequestMethod.GET)
    @ApiOperation(value = "没有登录")
    public Result<Object> needLogin() {

        return new ResultUtil<>().setErrorMsg(401, "您还未登录");
    }
}

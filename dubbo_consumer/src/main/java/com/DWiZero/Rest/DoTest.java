package com.DWiZero.Rest;

import com.DWiZero.GlobleBean.ResponseEntry;
import com.DWiZero.User.UserService;
import org.apache.dubbo.config.annotation.Reference;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DoTest
{
    @Reference(timeout = 300)
    private UserService userService;

    @ApiOperation("/getUserCacheTest")
    @RequestMapping(value = "/getUserCacheTest", method = RequestMethod.GET)
    public ResponseEntry testGetUserCache(@RequestParam() Integer uid)
    {
        ResponseEntry responseEntry = new ResponseEntry();
        responseEntry.setData(userService.findUser(uid));
        return responseEntry;
    }

    @ApiOperation("/delUserCacheTest")
    @RequestMapping(value = "/delUserCacheTest", method = RequestMethod.DELETE)
    public ResponseEntry testDelUserCache(@RequestParam() Integer uid)
    {
        ResponseEntry responseEntry = new ResponseEntry();
        responseEntry.setData(userService.delUser(uid));
        return responseEntry;
    }
}

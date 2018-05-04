package com.DWiZero.Services.User;

import com.DWiZero.VO.userInfo;
import com.DWiZero.user.userService;
import com.DWiZero.Mapper.userInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class userServiceImpl implements userService
{
    @Autowired
    private userInfoMapper userInfoMapper;

    @Override
    public userInfo findUser(Integer uid)
    {
        return userInfoMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int delUser(Integer uid)
    {
        return userInfoMapper.deleteByPrimaryKey(uid);
    }
}

package com.DWiZero.Services.User;

import com.DWiZero.VO.UserInfo;
import com.DWiZero.user.UserService;
import com.DWiZero.Mapper.userInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class userServiceImpl implements UserService
{
    @Autowired
    private userInfoMapper userInfoMapper;

    @Override
    public UserInfo findUser(Integer uid)
    {
        return userInfoMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int delUser(Integer uid)
    {
        return userInfoMapper.deleteByPrimaryKey(uid);
    }
}

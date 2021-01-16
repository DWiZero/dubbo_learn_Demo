package com.DWiZero.Services.User;

import com.DWiZero.VO.UserInfo;
import com.DWiZero.User.UserService;
import com.DWiZero.Mapper.UserInfoMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findUser(Integer uid) {
        return userInfoMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int delUser(Integer uid) {
        return userInfoMapper.deleteByPrimaryKey(uid);
    }
}

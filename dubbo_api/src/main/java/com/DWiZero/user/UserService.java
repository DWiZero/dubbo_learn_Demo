package com.DWiZero.user;

import com.DWiZero.VO.UserInfo;


public interface UserService
{
    UserInfo findUser(Integer uid);

    int delUser(Integer uid);
}

package com.DWiZero.User;

import com.DWiZero.VO.UserInfo;


public interface UserService
{
    UserInfo findUser(Integer uid);

    int delUser(Integer uid);
}

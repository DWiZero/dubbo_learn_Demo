package com.DWiZero.user;

import com.DWiZero.VO.userInfo;


public interface userService
{
    userInfo findUser(Integer uid);

    int delUser(Integer uid);
}

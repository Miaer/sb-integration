package com.cazl.business.service;


import com.cazl.business.entity.tbUser;

public interface UserService {
    void UserInsert(tbUser user);
    void UserSelect(tbUser user);
    void UserUpdate(tbUser user);
    void UserDelete(tbUser user);

    void poolTest() throws InterruptedException;
}

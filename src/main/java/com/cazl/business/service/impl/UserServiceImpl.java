//--------------------------------------------------------------------
// 日期：2019/7/15 10:56
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.business.service.impl;

import com.cazl.business.dao.UserDao;
import com.cazl.business.entity.tbUser;
import com.cazl.business.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Log
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public void UserInsert(tbUser user) {
        int insert = userDao.insert(user);
        System.out.println(insert);
    }

    @Override
    public void UserSelect(tbUser user) {

    }

    @Override
    public void UserUpdate(tbUser user) {

    }

    @Override
    public void UserDelete(tbUser user) {

    }

    @Override
    @Async("taskExecutor")
    public void poolTest() throws InterruptedException {
        log.info("start executeAsync");
        Thread.sleep(1000);
        log.info("end executeAsync");
    }
}

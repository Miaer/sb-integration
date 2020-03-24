//--------------------------------------------------------------------
// 日期：2019/7/15 13:50
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.test.mybatis;

import com.cazl.business.dao.UserDao;
import com.cazl.business.entity.tbUser;
import com.cazl.test.baseTest.BaseTest;
import com.cazl.transfer.NettyServer;
import lombok.val;
import org.junit.Test;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class CrudTest extends BaseTest {

    private final static Logger logger = LoggerFactory.getLogger(NettyServer.class);
    @Autowired
    UserDao userDao;

    /**
     * 测试数据库交互。
     */
    @Test
    @Async("executor1")
    public void insertSelective() {
        tbUser user = new tbUser();
        user.setName("张三");
        user.setPassword("123456");
        long startTime = System.currentTimeMillis();
        logger.info(String.valueOf(new Date(startTime)));
        int i = 10000;
        StringBuffer sb = new StringBuffer("INSERT INTO TB_USERS VALUE('张三','123'),");
        sb.append("('张三','123'),");
        while (!(i <= 0)){
            userDao.insertSelective(user);
            i--;
        }
        long endTime = System.currentTimeMillis();
        logger.info(String.valueOf(new Date(endTime)));
        logger.info(String.valueOf(new Date(endTime - startTime)));
        /*user.setPassword("123");
        userDao.insertSelective(user);       // 插入
        userDao.deleteByPrimaryKey(13);  // 通过主键删除
        userDao.selectAll();                // 获取所有
        userDao.updateByPrimaryKey(user);   // 修改*/
    }


    @Test
    @Transactional
    public void testDelete(){
        val a = new HashMap<>();
        a.put("张三",10);

        System.out.println(a);
        userDao.deleteByPrimaryKey(10000);
    }

    @Test
    @Transactional
    public void testSelectAll(){
        List<tbUser> tbUsers = userDao.selectAll();
    }

    @Test
    @Transactional
    public void testUpdate(){
        tbUser user = new tbUser();
        user.setId(10);
        user.setPassword("456");
        userDao.updateByPrimaryKey(user);
    }

    @Test
    public void in(){
        tbUser user = new tbUser();
        user.setId(10);
        user.setPassword("456");
        userDao.updateByPrimaryKey(user);
    }
}

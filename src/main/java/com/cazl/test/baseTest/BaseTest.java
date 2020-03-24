//--------------------------------------------------------------------
// 日期：2019/7/15 13:57
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.test.baseTest;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
/**
 * 我们会写很多很多测试类，每个测试类都需要上面几个注解，所以我们在这个类上面加上注解，其他测试类继承该类即可。
 */
public class BaseTest {
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

}

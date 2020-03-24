//--------------------------------------------------------------------
// 日期：2019/7/15 15:42
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.test.controller;

import com.cazl.test.baseTest.BaseTest;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestController extends BaseTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }



}

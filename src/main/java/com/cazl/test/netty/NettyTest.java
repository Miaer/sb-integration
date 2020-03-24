//--------------------------------------------------------------------
// 日期：2019/7/15 18:20
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.test.netty;

import com.cazl.transfer.NettyServer;
import org.junit.Test;

public class NettyTest {

    @Test
    public void startNettyServer(){
        NettyServer.startServer(10000);
    }

    @Test
    public void endNettyServer(){

    }
}

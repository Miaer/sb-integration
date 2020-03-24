//--------------------------------------------------------------------
// 日期：2019/8/8 20:42
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.test.test;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String url = "D:\\Upload";
        delDir(url);
    }

    public static void delDir(String path){
        File dir=new File(path);
        if(dir.exists()){
            File[] tmp=dir.listFiles();
            for(int i=0;i<tmp.length;i++){
                if(tmp[i].isDirectory()){
                    delDir(path+"/"+tmp[i].getName());
                }
                else{
                    tmp[i].delete();
                }
            }
            dir.delete();
        }
    }
}

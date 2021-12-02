package com.fyx.javase.IO;

import java.util.logging.Logger;

public class LogTest {
    public static void main(String[] args) {
        //测试工具类是否好用
        LogUtil.logger("调用了System类的gc()方法，建议启动垃圾回收");
        LogUtil.logger("调用了UserService的doSome()方法");
        LogUtil.logger("用户尝试登录，验证失败");
        LogUtil.logger("我非常喜欢这个日志记录的工具哦！");
    }
}

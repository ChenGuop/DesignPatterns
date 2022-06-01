package com.cgp.design.patterns.structural.bridge.example.remotes;

/**
 * @Classname Remote
 * @Author ChenGuop
 * @Date 2022/5/31 8:55
 * @Description:  所有远程控制器的通用接口
 */
public interface Remote{
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}

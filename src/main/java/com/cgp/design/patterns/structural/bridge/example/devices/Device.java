package com.cgp.design.patterns.structural.bridge.example.devices;

/**
 * @Classname Device
 * @Author ChenGuop
 * @Date 2022/5/31 8:51
 * @Description: 所有设备的通用接口
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
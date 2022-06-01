package com.cgp.design.patterns.structural.bridge.example.remotes;

import com.cgp.design.patterns.structural.bridge.example.devices.Device;

/**
 * @Classname AdvancedRemote
 * @Author ChenGuop
 * @Date 2022/5/31 9:01
 * @Description: 高级远程控制器
 */
public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}

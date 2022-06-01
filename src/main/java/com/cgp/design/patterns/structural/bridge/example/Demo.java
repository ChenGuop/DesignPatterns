package com.cgp.design.patterns.structural.bridge.example;

import com.cgp.design.patterns.structural.bridge.example.devices.Device;
import com.cgp.design.patterns.structural.bridge.example.devices.Radio;
import com.cgp.design.patterns.structural.bridge.example.devices.Tv;
import com.cgp.design.patterns.structural.bridge.example.remotes.AdvancedRemote;
import com.cgp.design.patterns.structural.bridge.example.remotes.BasicRemote;

/**
 * @Classname Demo
 * @Author ChenGuop
 * @Date 2022/5/31 9:03
 * @Description:
 *
 * 设备和远程控制之间的桥接
 * 本例展示了远程控制器及其所控制的设备的类之间的分离。
 *
 * 远程控制器是抽象部分， 设备则是其实现部分。 由于有通用的接口， 同一远程控制器可与不同的设备合作， 反过来也一样。
 *
 * 桥接模式允许在不改动另一层次代码的前提下修改已有类， 甚至创建新类。
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

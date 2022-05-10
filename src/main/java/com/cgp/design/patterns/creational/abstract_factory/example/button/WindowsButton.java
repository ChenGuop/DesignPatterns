package com.cgp.design.patterns.creational.abstract_factory.example.button;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}

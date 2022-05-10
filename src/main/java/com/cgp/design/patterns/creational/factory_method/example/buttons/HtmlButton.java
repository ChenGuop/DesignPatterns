package com.cgp.design.patterns.creational.factory_method.example.buttons;

/**
 * @author chen_guo_peng
 * @create 2022/3/21
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}

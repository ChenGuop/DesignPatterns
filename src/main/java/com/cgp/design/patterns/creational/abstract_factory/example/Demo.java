package com.cgp.design.patterns.creational.abstract_factory.example;

import com.cgp.design.patterns.creational.abstract_factory.example.app.Application;
import com.cgp.design.patterns.creational.abstract_factory.example.factories.GUIFactory;
import com.cgp.design.patterns.creational.abstract_factory.example.factories.MacOsFactory;
import com.cgp.design.patterns.creational.abstract_factory.example.factories.WindowsFactory;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class Demo {
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}

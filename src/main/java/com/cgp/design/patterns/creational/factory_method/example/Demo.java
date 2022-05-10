package com.cgp.design.patterns.creational.factory_method.example;

import com.cgp.design.patterns.creational.factory_method.example.factory.Dialog;
import com.cgp.design.patterns.creational.factory_method.example.factory.HtmlDialog;
import com.cgp.design.patterns.creational.factory_method.example.factory.WindowsDialog;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
